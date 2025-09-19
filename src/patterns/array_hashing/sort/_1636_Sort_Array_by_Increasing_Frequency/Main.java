package patterns.array_hashing.sort._1636_Sort_Array_by_Increasing_Frequency;

import java.util.*;

public class Main {
    private static int[] frequencySort(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        Integer[] numsObj = new Integer[nums.length];
        for (int i = 0; i < nums.length; i++) {
            numsObj[i] = nums[i];
        }

        Arrays.sort(numsObj, (a, b) -> {
            if (map.get(a).equals(map.get(b))) {
                return Integer.compare(b, a);
            }

            return Integer.compare(map.get(a), map.get(b));
        });

        for (int i = 0; i < nums.length; i++) {
            nums[i] = numsObj[i];
        }

        return nums;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(frequencySort(new int[]{1,1,2,2,2,3})));
        System.out.println(Arrays.toString(frequencySort(new int[]{2,3,1,3,2})));
        System.out.println(Arrays.toString(frequencySort(new int[]{-1,1,-6,4,5,-6,1,4,1})));
    }
}
