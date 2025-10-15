package main.patterns.bsearch._2300_Successful_Pairs_of_Spells_and_Potions;

import java.util.Arrays;

public class Main {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int[] res = new int[spells.length];

        for (int i = 0; i < spells.length; i++) {
            // bin search
            int left = 0, right = potions.length - 1, idx = potions.length;
            while (left <= right) {
                int mid = (left + right) / 2;
                if ((long)spells[i] * potions[mid] >= success) {
                    right = mid - 1;
                    idx = mid;
                } else {
                    left = mid + 1;
                }
            }

            res[i] = potions.length - idx;
        }
        return res;
    }

    public static void main(String[] args) {

    }
}
