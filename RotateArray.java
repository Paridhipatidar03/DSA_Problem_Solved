import java.util.Arrays;

class RotateArray {
    public void rotate(int[] nums, int k) {
        if (nums.length < k) {
            k = k % nums.length;
        }
        int[] suffix = new int[k];
        for (int m = 0; m < k; m++) {
            suffix[k - m - 1] = nums[nums.length - m - 1];
        }
        for (int i = nums.length - 1; i >= k; i--) {
            nums[i] = nums[i - k];
        }
        for (int m = 0; m < k; m++) {
            nums[m] = suffix[m];
        }
    }

    public static void main(String[] args) {
        RotateArray solution = new RotateArray();
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        System.out.println("Before rotation: " + Arrays.toString(nums));
        solution.rotate(nums, k);
        System.out.println("After rotation: " + Arrays.toString(nums));
    }
}