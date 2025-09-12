package patterns.array_hashing._485_Max_Consecutive_Ones;

public class Main {
    private static int findMaxConsecutiveOnes(int[] nums) {
        int max = Integer.MIN_VALUE;
        int count = 0;

        for (int i : nums) {
            if (i == 0) {
                count = 0;
                //continue;
            } else count++;

            if (count > max) {
                max = count;
            }
        }

        return max;
    }
    public static void main(String[] args) {
        System.out.println(findMaxConsecutiveOnes(new int[]{0, 1, 0, 0, 1, 1, 1, 0}));
        System.out.println(findMaxConsecutiveOnes(new int[]{1, 1, 0, 1, 1, 1}));
    }
}
