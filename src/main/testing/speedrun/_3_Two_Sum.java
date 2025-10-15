package main.testing.speedrun;

import java.util.Arrays;
import java.util.HashMap;

public class _3_Two_Sum {
    public static int[] twoSum(int[] nums, int target) {
        // Constraints: 2 <= nums.length <= 1000
        // -10,000,000 <= nums[i] <= 10,000,000
        // -10,000,000 <= target <= 10,000,000
        // for each num in nums
        // target = num + x
        // => x = target - num
        // x != num
        HashMap<Integer, Integer> count = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            count.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (count.containsKey(complement) && i != count.get(complement)) {
                return new int[]{i, count.get(complement)};
            }
        }

        return new int[0];
    }
    public static void main(String[] args) {
        int[] nums = {11, 2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }
}
