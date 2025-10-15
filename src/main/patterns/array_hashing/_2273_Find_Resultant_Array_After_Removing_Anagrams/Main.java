package main.patterns.array_hashing._2273_Find_Resultant_Array_After_Removing_Anagrams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public List<String> removeAnagrams(String[] words) {
        List<String> res = new ArrayList<>();
        res.add(words[0]);
        for (int i = 1; i < words.length; i++) {
            if (!isAnagram(words[i], words[i - 1])) {
                res.add(words[i]);
            }
        }

        return res;
    }

    private static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) return false;

        Map<Character, Integer> countA = new HashMap<>();
        Map<Character, Integer> countB = new HashMap<>();
        for (int i = 0; i < a.length(); i++) {
            countA.put(a.charAt(i), countA.getOrDefault(a.charAt(i), 0 ) + 1);
            countB.put(b.charAt(i), countB.getOrDefault(b.charAt(i), 0) + 1);
        }

        return countA.equals(countB);
    }
    public static void main(String[] args) {

    }
}
