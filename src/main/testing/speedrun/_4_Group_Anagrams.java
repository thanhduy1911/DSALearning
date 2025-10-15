package main.testing.speedrun;

import java.util.*;

public class _4_Group_Anagrams {
    private static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> res = new HashMap<>();
        for (String s : strs) {
            int[] count = new int[26];
            for (char c : s.toCharArray()) {
                count[c - 'a']++;
            }
            String stringKey = Arrays.toString(count);
            res.putIfAbsent(stringKey, new ArrayList<>());
            res.get(stringKey).add(s);
        }
        return new ArrayList<>(res.values());
    }
    public static void main(String[] args) {
        System.out.println(groupAnagrams(new String[]{"act","pots","tops","cat","stop","hat"}));
    }
}
