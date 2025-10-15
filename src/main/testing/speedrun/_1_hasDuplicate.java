package main.testing.speedrun;

import java.util.HashMap;
import java.util.Map;

public class _1_hasDuplicate {
    public static boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        for (int num : nums) {
            if (freqMap.get(num) >= 2) {
                return true;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        System.out.println(hasDuplicate(new int[]{1, 2, 3, 1}));
    }
}
