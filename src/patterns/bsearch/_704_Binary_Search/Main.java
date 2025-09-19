package patterns.bsearch._704_Binary_Search;

public class Main {
    private static int search(int[] nums, int target) {
        int res = -1;
        int n = nums.length;
        int left = 0;
        int right = n - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (target > nums[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return res;
    }
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 7, 9};
        int target = 9;
        System.out.println(search(nums, target));
    }
}
