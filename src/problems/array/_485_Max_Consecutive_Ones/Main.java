package problems.array._485_Max_Consecutive_Ones;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1};
        int[] nums2 = {1,0,1,1,0,1};
        Solution solution = new Solution();

        System.out.println(solution.findMaxConsecutiveOnes(nums));
        System.out.println(solution.findMaxConsecutiveOnes(nums2));
    }
}
