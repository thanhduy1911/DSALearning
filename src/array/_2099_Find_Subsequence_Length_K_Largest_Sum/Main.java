package array._2099_Find_Subsequence_Length_K_Largest_Sum;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6, 7};
        int k = 2;
        int[] nums2 = {2,1,3,3};
        int k2 = 2;
        int[] nums3 = {-1,-2,3,4};
        int k3 = 3;
        int[] nums4 = {3,4,4,3};
        int k4 = 2;

        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.maxSubsequence(nums, k)));
        System.out.println(Arrays.toString(solution.maxSubsequence(nums2, k2)));
        System.out.println(Arrays.toString(solution.maxSubsequence(nums3, k3)));
        System.out.println(Arrays.toString(solution.maxSubsequence(nums4, k4)));
    }
}
