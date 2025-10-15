package main.patterns.string._3541_Find_Most_Frequent_Vowel_and_Consonant;

import java.util.HashMap;

public class Main {
    private static int maxFreSum(String s) {
        if (s.isEmpty()) return 0;

        HashMap<Character, Integer> consonantMap = new HashMap<>();
        HashMap<Character, Integer> vowelMap = new HashMap<>();
        int vowel = 0, consonant = 0;

        for (char c : s.toCharArray()) {
            if ("aeiou".indexOf(c) == -1) {
                consonantMap.put(c, consonantMap.getOrDefault(c, 0) + 1);
            } else {
                vowelMap.put(c, vowelMap.getOrDefault(c, 0) + 1);
            }
        }

        // find max frequency in each vowel and consonant
        for (Integer freq : vowelMap.values()) {
            consonant = Math.max(consonant, freq);
        }
        for (Integer freq : consonantMap.values()) {
            vowel = Math.max(vowel, freq);
        }

        return vowel + consonant;
    }
    public static void main(String[] args) {
        System.out.println(maxFreSum("successes"));
        System.out.println(maxFreSum("a"));
        System.out.println(maxFreSum("aeiaeia"));
        System.out.println(maxFreSum("ouu"));
        System.out.println(maxFreSum("bx"));
    }
}
