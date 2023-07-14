package PrePlacementTraning.DSaAssignment3;

import java.util.ArrayList;
import java.util.List;

public class Que7 {
    public static List<String> findMissingRanges(int[] nums, int lower, int upper) {
        List<String> result = new ArrayList<>();
        int start = lower;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == start) {
                start++;
            } else if (nums[i] > start) {
                result.add(getRangeString(start, nums[i] - 1));
                start = nums[i] + 1;
            }
        }

        if (start <= upper) {
            result.add(getRangeString(start, upper));
        }

        return result;
    }

    private static String getRangeString(int start, int end) {
        if (start == end) {
            return Integer.toString(start);
        } else {
            return start + "->" + end;
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 3, 50, 75};
        int lower = 0;
        int upper = 99;
        List<String> missingRanges = findMissingRanges(nums, lower, upper);

        for (String range : missingRanges) {
            System.out.println(range);
        }
    }
}

