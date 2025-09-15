package patterns.string._966_Vowel_Spellchecker;

import java.util.*;

public class Main {
    static Set<String> exactlyWords;
    static Map<String, String> capitalizedWords;
    static Map<String, String> vowelWords;

    private static boolean isVowel(char ch) {
        return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
    }

    private static String decode(String word) {
        StringBuilder result = new StringBuilder();
        for (char c : word.toCharArray()) {
            result.append(isVowel(c) ? 'X' : c);
        }

        return result.toString();
    }

    public static String[] spellchecker(String[] wordlist, String[] queries) {
        String[] result = new String[queries.length];
        exactlyWords = new HashSet<>();
        capitalizedWords = new HashMap<>();
        vowelWords = new HashMap<>();

        // word list
        for (String word : wordlist) {
            exactlyWords.add(word);

            String wordLow = word.toLowerCase();
            capitalizedWords.putIfAbsent(wordLow, word);

            String wordLowDV = decode(wordLow);
            vowelWords.putIfAbsent(wordLowDV, word);
        }

        // queries
        int i = 0;
        for (String query : queries) {
            result[i++] = solve(query);
        }

        return result;
    }
    public static String solve(String query) {
        if (exactlyWords.contains(query))
            return query;

        String queryL = query.toLowerCase();
        if (capitalizedWords.containsKey(queryL))
            return capitalizedWords.get(queryL);

        String queryLV = decode(queryL);
        if (vowelWords.containsKey(queryLV))
            return vowelWords.get(queryLV);

        return "";
    }
    public static void main(String[] args) {
        String[] wordlist = new String[] {"KiTe","kite","hare","Hare"};
        String[] queries = new String[] {"kite","Kite","KiTe","Hare","HARE","Hear","hear","keti","keet","ketore"};

        System.out.println(Arrays.toString(spellchecker(wordlist, queries)));
    }
}
