package problems.array._1_Two_Sum;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums1 = {2,7,11,15};
        int target1 = 9;
        int[] nums2 = {2,3,4};
        int target2 = 6;
        int[] nums3 = {3,3};
        int target3 = 6;

        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.twoSum(nums1, target1)));
        System.out.println(Arrays.toString(solution.twoSum(nums2, target2)));
        System.out.println(Arrays.toString(solution.twoSum(nums3, target3)));

    }
}
