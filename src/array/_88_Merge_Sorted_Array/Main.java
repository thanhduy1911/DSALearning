package array._88_Merge_Sorted_Array;

public class Main {
    public static void main(String[] args) {
        int[] nums1 = {2,3,4,5,0,0,0};
        int[] nums2 = {0,3,6};
        Solution solution = new Solution();
        solution.mergeK(nums1, 4, nums2, 3);

        //solution.merge(nums1, 4, nums2, 3);
    }
}
