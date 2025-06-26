package array._27_Remove_Element;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int target = 7;
        int[] nums2 = {3,2,2,3,3};
        int target2 = 3;
        Solution solution = new Solution();
        System.out.println(solution.removeElement(nums, target));
        System.out.println(solution.removeElement(nums2, target2));
    }
}
