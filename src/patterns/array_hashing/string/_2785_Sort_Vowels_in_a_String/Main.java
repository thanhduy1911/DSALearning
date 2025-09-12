package patterns.array_hashing.string._2785_Sort_Vowels_in_a_String;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    static String vowelWords = "aeiouAEIOU";

    private static boolean isVowel(char ch) {
        return vowelWords.indexOf(ch) != -1;
    }

    private static String sortVowels(String s) {

        // create a array list to sort first
        List<Character> vowels = new ArrayList<>();
        for (char c : s.toCharArray()) {
            if (isVowel(c)) {
                vowels.add(c);
            }
        }

        Collections.sort(vowels);
        // append if c is vowel
        StringBuilder res = new StringBuilder();
        int idx = 0;
        for (char c : s.toCharArray()) {
            if (isVowel(c)) {
                res.append(vowels.get(idx++));
            } else {
                res.append(c);
            }
        }
        return res.toString();
    }
    public static void main(String[] args) {
        System.out.println(sortVowels("lEetcOde"));
        System.out.println(sortVowels("lYmpH"));
    }
}
