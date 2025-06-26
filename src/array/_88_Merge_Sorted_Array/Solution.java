package array._88_Merge_Sorted_Array;

import java.util.Arrays;

public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i : nums2) {
            insertToArray(i, nums1, m);
            m++;
        }

        System.out.println(Arrays.toString(nums1));
    }

    private void insertToArray(int x, int[] a, int m) {
        boolean isFoundK = false;

        for (int k = 0; k < m; k++) {
            if (a[k] > x) {
                isFoundK = true;
                for (int i = m-1; i >= k; i--) {
                    a[i+1] = a[i];
                }
                a[k] = x;
                break;
            }
        }
        if (!isFoundK) {
            a[m] = x;
        }
    }

    // Using two pointers
    public void mergeK(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1; int j = n - 1;
        int k = (m + n) - 1;

        while (k >= 0) {
            if (j < 0) {
                nums1[k] = nums1[i];
                i--;
            } else if (i < 0) {
                nums1[k] = nums2[j];
                j--;
            } else if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }

            k--;
        }

        System.out.println(Arrays.toString(nums1));
    }
}
