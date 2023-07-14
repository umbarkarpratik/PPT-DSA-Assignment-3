package PrePlacementTraning.DSaAssignment3;

public class Que6 {
    public static int singleNumber(int[] nums) {
        int result = 0;

        for (int num : nums) {
            result ^= num;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 1};
        int single = singleNumber(nums);
        System.out.println(single); // Output: 1
    }
}
