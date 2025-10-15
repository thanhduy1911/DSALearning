package main.patterns.array_hashing._3349_Adjecent_Increasing_Subarrays_Detection_I;

import java.util.List;
import java.util.Objects;

public class Main {
    // Approval 1 - O(n*k)
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        if (2 * k > nums.size()) return false;

        int n = nums.size();
        for (int i = 0; i < n - 2 * k + 1; i++) {
            if (isStrictlyIncreasing(nums, i, i + k) && isStrictlyIncreasing(nums, i + k, i + 2 * k)) {
                return true;
            }
        }

        return false;

    }

    private static boolean isStrictlyIncreasing(List<Integer> arr, int start, int end) {
        for (int i = start; i < end - 1; i++) {
            if (arr.get(i) >= arr.get(i + 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

    }
}
