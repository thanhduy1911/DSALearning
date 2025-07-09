package problems.string._3333_Find_The_Original_Typed_String_II;

public class Main {
    public static void main(String[] args) {
        // test case
        String word = "aabbccdd";
        String word1 = "aaabbb";
        Solution solution = new Solution();
        System.out.println(solution.possibleStringCount(word, 7));
        System.out.println(solution.possibleStringCount(word, 8));
        System.out.println(solution.possibleStringCount(word1, 3));
    }
}
