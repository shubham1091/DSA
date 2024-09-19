package Linear.Arrays.ND;

public class Seven {
    public static void main(String[] args) {
        int[][] arr = { { 4, 7, 8 }, { 8, 8, 7 } };
        System.out.println(CountSevens(arr));

    }

    private static int CountSevens(int[][] arr) {
        int count = 0;
        for (int[] row : arr) {
            for (int val : row) {
                if (val == 7) {
                    count++;
                }
            }
        }
        return count;
    }

}
