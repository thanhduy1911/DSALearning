package patterns.array_hashing._1346_Check_If_N_and_Its_Double_Exist;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static boolean checkIfExist(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == 2 * arr[j] || arr[j] == 2 * arr[i]) {
                    return true;
                }
            }
        }

        return false;
    }

    // use a hash set (more difficult to understand)
    public static boolean checkIfExist2(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (set.contains(num * 2) || (num % 2 == 0 && set.contains(num / 2))) {
                return true;
            }
            set.add(num);
        }

        return false;
    }
    public static void main(String[] args) {
        System.out.println(checkIfExist(new int[]{10, 2, 3, 4, 5}));
        System.out.println(checkIfExist(new int[]{3,1,7,11}));
    }
}
