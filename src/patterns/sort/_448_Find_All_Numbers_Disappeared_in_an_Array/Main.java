package patterns.sort._448_Find_All_Numbers_Disappeared_in_an_Array;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res = new ArrayList<>();
        boolean[] exists = new boolean[nums.length + 1];
        for (int num : nums) {
            exists[num] = true;
        }

        for (int i = 1; i <= nums.length; i++) {
            if (!exists[i]) {
                res.add(i);
            }
        }

        return res;
    }
    public static void main(String[] args) {

    }
}
