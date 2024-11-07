
public class ShuffleArray {

    public static int[] shuffle(int[] nums, int n) {
        int[] result = new int[2 * n];
        int index = 0;

        for (int i = 0; i < n; i++) {
            result[index++] = nums[i];
            result[index++] = nums[i + n];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {2, 5, 1, 3, 4, 7};
        int n1 = 3;
        int[] result1 = shuffle(nums1, n1);
        System.out.println("Output: " + java.util.Arrays.toString(result1)); // Output: [2, 3, 5, 4, 1, 7]

        int[] nums2 = {1, 2, 3, 4, 4, 3, 2, 1};
        int n2 = 4;
        int[] result2 = shuffle(nums2, n2);
        System.out.println("Output: " + java.util.Arrays.toString(result2)); // Output: [1, 4, 2, 3, 3, 2, 4, 1]

        int[] nums3 = {1, 1, 2, 2};
        int n3 = 2;
        int[] result3 = shuffle(nums3, n3);
        System.out.println("Output: " + java.util.Arrays.toString(result3)); // Output: [1, 2, 1, 2]
    }
}
