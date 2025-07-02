package string._3330_Find_The_Original_Typed_String_I;

public class Solution {
    public int possibleStringCount(String word) {
        int answer = 0;
        int prevChar = word.charAt(0);

        for (int i = 1; i < word.length(); i++) {
            if (word.charAt(i) == prevChar) {
                answer++;
            }

            prevChar = word.charAt(i);
        }

        return answer + 1;
    }
}
