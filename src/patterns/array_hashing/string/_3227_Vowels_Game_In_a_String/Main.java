package patterns.array_hashing.string._3227_Vowels_Game_In_a_String;

public class Main {
    static String vowels = "aeiou";

    private static boolean doesAliceWin(String s) {
        if (s.isEmpty()) return false;
        for (char c : s.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(doesAliceWin("leetcoder"));
        System.out.println(doesAliceWin("bbcd"));
        System.out.println(doesAliceWin(""));
    }
}
