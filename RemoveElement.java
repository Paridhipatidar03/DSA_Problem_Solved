package DSA_Problem_Solved;

import java.util.Arrays;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        RemoveElement solution = new RemoveElement();

        int[] nums = {3, 2, 2, 3, 4, 5, 3}; // Example array
        int val = 3;

        int newLength = solution.removeElement(nums, val);

        // Print the updated array (valid part only)
        System.out.println("New Length: " + newLength);
        System.out.println("Updated Array: " + Arrays.toString(Arrays.copyOf(nums, newLength)));
    }
}

