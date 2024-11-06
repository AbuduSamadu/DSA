package Weeks.Week2;

import java.util.Arrays;

public class Remove {

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        Remove remove = new Remove();
        int[] nums = {1, 1, 2, 2, 3, 4, 6, 6, 6, 7, 8, 8, 9};
        int newLength = remove.removeDuplicates(nums);
        System.out.println("New length: " + newLength);
        System.out.println("Modified array: " + Arrays.toString(Arrays.copyOf(nums, newLength)));
    }
}
