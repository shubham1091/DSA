package Linear.Arrays.Basic;

public class Duplicates {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 };
        System.out.println(containsDuplicate(nums));

    }

    public static boolean containsDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;

    }

}
