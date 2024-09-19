package Linear.Arrays.ND;

public class RowSum {
    public static void main(String[] args) {
        int[][] nums = { { 1, 4, 9 }, { 11, 4, 3 }, { 2, 2, 3 } };
        System.out.println(SecondRowSum(nums));
    }

    private static int SecondRowSum(int[][] nums) {
        int sum = 0;
        for (int i = 0; i < nums[1].length; i++) {
            sum += nums[1][i];
        }
        return sum;
    }

}
