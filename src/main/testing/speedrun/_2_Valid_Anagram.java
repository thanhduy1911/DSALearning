package main.testing.speedrun;

import java.util.*;

public class _2_Valid_Anagram {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> sMap = new HashMap<>();
        HashMap<Character, Integer> tMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i), 0) + 1);
            tMap.put(s.charAt(i), tMap.getOrDefault(s.charAt(i), 0) + 1);
        }

        return sMap.equals(tMap);
    }
    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram")); // true
        System.out.println(isAnagram("jar", "jam")); // false
        System.out.println(isAnagram("racecar", "carrace")); // true
    }
}
