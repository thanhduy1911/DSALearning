package main.patterns.array_hashing._3350_Adjacent_Increasing_Subarrays_Detection_II;

import java.util.List;

public class Main {
    public static int maxIncreasingSubarrays(List<Integer> nums) {
        int n = nums.size();
        int res = 0, cnt = 1, preCnt = 0;
        for (int i = 1; i < n; i++) {
            if (nums.get(i) > nums.get(i - 1)) {
                cnt++;
            } else {
                preCnt = cnt;
                cnt = 1;
            }

            res = Math.max(res, Math.min(cnt, preCnt));
            res = Math.max(res, cnt / 2);
        }

        return res;
    }
    public static void main(String[] args) {

    }
}
