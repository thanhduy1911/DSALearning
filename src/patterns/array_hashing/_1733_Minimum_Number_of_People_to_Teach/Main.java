package patterns.array_hashing._1733_Minimum_Number_of_People_to_Teach;

import java.util.BitSet;

public class Main {
    private static int minimumTeachings(int n, int[][] languages, int[][] friendships) {
        int m = languages.length;
        // known languages from each person
        BitSet[] know = new BitSet[m];
        for (int i = 0; i < m; i++) {
            know[i] = new BitSet(n + 1); // start from 1..n
            for (int l : languages[i]) {
                know[i].set(l);
            }
        }

        // mark people need to learn lang
        boolean[] need = new boolean[m];
        for (int[] f : friendships) {
            int a = f[0] - 1;
            int b = f[1] - 1;
            BitSet common = (BitSet) know[a].clone();
            common.and(know[b]);
            if (!common.isEmpty()) continue;
            need[a] = true;
            need[b] = true;
        }

        // if no people need to learn --> return 0
        boolean anyNeed = false;
        for (boolean x : need) {
            if (x) {
                anyNeed = true;
                break;
            }
        }

        if (!anyNeed) return 0;

        int ans = Integer.MAX_VALUE;
        for (int lang = 1; lang <= n; lang++) {
            int count = 0;
            for (int i = 0; i < m; i++) {
                if (need[i] && !know[i].get(lang)) {
                    count++;
                }
            }
            ans = Math.min(ans, count);
        }

        return ans;
    }
    public static void main(String[] args) {
        System.out.println(minimumTeachings(2, new int[][]{{1}, {2}, {1,2}}, new int[][]{{1,2}, {1,3}, {2,3}}));
        System.out.println(minimumTeachings(3, new int[][]{{2}, {1,3}, {1,2}, {3}}, new int[][]{{1,4}, {1,2}, {3,4}, {2,3}}));
    }
}
