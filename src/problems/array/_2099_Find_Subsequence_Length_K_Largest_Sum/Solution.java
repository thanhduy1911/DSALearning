package problems.array._2099_Find_Subsequence_Length_K_Largest_Sum;

import java.util.Arrays;

public class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        // Create problems.array of [value, index] pairs
        int[][] valueWithIndex = new int[nums.length][2];
        for (int i = 0; i < nums.length; i++) {
            valueWithIndex[i] = new int[] { nums[i], i};
        }

        // Sort pairs by value in descending order
        Arrays.sort(valueWithIndex, (o1, o2) -> o2[0] - o1[0]);
        // Take first k elements and sort by original index
        Arrays.sort(valueWithIndex, 0, k, (o1, o2) -> o2[1] - o1[1]);
        // Sorts only the first k elements by their original indices a[i]

        // Extract the result
        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            result[i] = valueWithIndex[i][0];
        }

        return result;
    }
}
