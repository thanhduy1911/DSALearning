package patterns.string._1935_Maximum_Number_of_Words_You_Can_Type;

import java.util.HashSet;
import java.util.Set;

public class Main {
    private static int canBeTypedWords(String text, String brokenLetters) {
        /*
            text: hello world
            broken letter: a, d with distinct
            so
            d exists in world -> cannot type world
            return 1 because only hello can be typed
        */
        // split text
        String[] words = text.split(" ");
        Set<Character> brokenLettersSet = new HashSet<>();
        int cnt = 0;

        for (char c : brokenLetters.toCharArray()) {
            brokenLettersSet.add(c);
        }

        for (String word : words) {
            boolean canBeTypedWord = true;

            for (char c : word.toCharArray()) {
                if (brokenLettersSet.contains(c)) {
                    canBeTypedWord = false;
                    break;
                }
            }

            if (canBeTypedWord) {
                cnt++;
            }
        }

        return cnt;
    }
    public static void main(String[] args) {
        System.out.println(canBeTypedWords("hello world", "ad"));
        System.out.println(canBeTypedWords("leet code", "lt"));
        System.out.println(canBeTypedWords("leet code", "e"));
    }
}
