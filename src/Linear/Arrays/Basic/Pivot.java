package Linear.Arrays.Basic;

public class Pivot {
    public static void main(String[] args) {
        int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0;
        System.out.println(pivot(nums, target));

    }

    public static int pivot(int[] nums, int target) {
        int leftPointer = 0, rightPointer = nums.length - 1;
        while (leftPointer < rightPointer) {
            int mid = leftPointer + (rightPointer - leftPointer) / 2;
            if (mid < nums.length && nums[mid] == target) {
                return mid;
            } else if (nums[mid] < nums[nums.length - 1]) {
                rightPointer = mid;
            } else {
                leftPointer = mid + 1;
            }
        }
        return -1;
    }

}
