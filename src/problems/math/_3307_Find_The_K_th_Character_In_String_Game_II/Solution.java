package problems.math._3307_Find_The_K_th_Character_In_String_Game_II;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public char KthCharacter(long k, int[] operations) {
        int shift = 0;
        List<Long> length = new ArrayList<>();
        long len = 1;

        for (int ignored : operations) {
            len *= 2;
            length.add(len);
            if (len >= k) break;
        }

        for (int i = length.size() - 1; i > 0; i--) {
            long half = length.get(i) / 2;
            int op = operations[i];

            if (k > half) {
                k -= half;
                if (op == 1) shift++;
            }
        }

        return (char) ((shift % 26) + 'a');
    }
}
