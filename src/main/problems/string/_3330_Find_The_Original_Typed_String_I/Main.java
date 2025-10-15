package main.problems.string._3330_Find_The_Original_Typed_String_I;

public class Main {
    public static void main(String[] args) {
        // test case
        String word = "abbcccc";
        String word1 = "abcd";
        String word2 = "aaaa";

        Solution solution = new Solution();
        System.out.println(solution.possibleStringCount(word));
        System.out.println(solution.possibleStringCount(word1));
        System.out.println(solution.possibleStringCount(word2));
    }
}
