public class removeEle {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test Case 1
        int[] nums1 = {3, 2, 2, 3};
        int val1 = 3;
        solution.removeElement(nums1, val1);  // Expected: 2

        // Test Case 2
        int[] nums2 = {1, 2, 3, 4};
        int val2 = 5;
        solution.removeElement(nums2, val2);  // Expected: 4

        // Test Case 3
        int[] nums3 = {3, 3, 3, 3};
        int val3 = 3;
        solution.removeElement(nums3, val3);  // Expected: 0

        // Test Case 4
        int[] nums4 = {1, 2, 3, 4};
        int val4 = 5;
        solution.removeElement(nums4, val4);  // Expected: 4

        // Test Case 5
        int[] nums5 = {1, 2, 3, 2, 4};
        int val5 = 2;
        solution.removeElement(nums5, val5);  // Expected: 3

        // Test Case 6
        int[] nums6 = {3};
        int val6 = 3;
        solution.removeElement(nums6, val6);  // Expected: 0

        // Test Case 7
        int[] nums7 = {5};
        int val7 = 3;
        solution.removeElement(nums7, val7);  // Expected: 1

        // Test Case 8
        int[] nums8 = {3, 1, 2, 4, 3};
        int val8 = 3;
        solution.removeElement(nums8, val8);  // Expected: 3

        // Test Case 9
        int[] nums9 = {};
        int val9 = 3;
        solution.removeElement(nums9, val9);  // Expected: 0

        // Test Case 10
        int[] nums10 = {2};
        int val10 = 3;
        solution.removeElement(nums10, val10);  // Expected: 1
    }
}


class Solution {
    public int removeElement(int[] nums, int val) {

        int k = nums.length;
        int i = 0;

        while (i < k) {
            if (nums[i] == val) {
                k--;
                nums[i] = nums[k];
            } else {
                i++;
            }
        }


        System.out.print("Array after removal: ");
        for (int j = 0; j < k; j++) {
            System.out.print(nums[j] + " ");
        }
        System.out.println();

        return k;
    }
}
