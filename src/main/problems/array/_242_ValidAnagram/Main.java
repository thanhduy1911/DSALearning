package main.problems.array._242_ValidAnagram;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.isAnagram("anagram", "nagaram"));
        System.out.println(solution.isAnagram("rat", "car"));
        System.out.println(solution.isAnagramUsingSort("rat", "car"));
        System.out.println(solution.isAnagramUsingSort("anagram", "nagaram"));
    }
}
