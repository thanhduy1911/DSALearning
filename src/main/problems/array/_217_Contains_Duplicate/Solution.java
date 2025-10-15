package main.problems.array._217_Contains_Duplicate;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean containsDuplicate(int[] nums) {
        if (nums == null || nums.length == 0) return false;

        // create a set
        Set<Integer> set = new HashSet<>();
        // enhance for loop
        for (int num : nums) {
            if (set.contains(num)) return true; // is duplicate --> return true immediate
            // if !duplicate --> add to HashSet set
            set.add(num);
        }

        // if distinct --> nothing duplicate
        return false;
    }
}
