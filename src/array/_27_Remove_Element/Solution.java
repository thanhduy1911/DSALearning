package array._27_Remove_Element;

public class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;

        for (int i = 0; i < n; ) {
            if (nums[i] == val) {
                for (int j = i; j < (n - 1); j++) {
                    nums[j] = nums[j + 1];
                }
                n--;
            } else i++;
        }

        return n;
    }
}
