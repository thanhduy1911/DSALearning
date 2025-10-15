package main.patterns.array_hashing._3_Longest_Substring_Without_Repeating_Characters;

import java.util.*;

public class Main {
    public static int lengthOfLongestSubstring(String s) {
        int res = 0;
        int left = 0;
        Set<Character> charSet = new HashSet<>();
        for (int right = 0; right < s.length(); right++) {
            while (charSet.contains(s.charAt(right))) {
                charSet.remove(s.charAt(left));
                left++;
            }
            charSet.add(s.charAt(right));

            res = Math.max(res, right - left + 1);
        }

        return res;
    }
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("bbbbbb"));
    }
}
