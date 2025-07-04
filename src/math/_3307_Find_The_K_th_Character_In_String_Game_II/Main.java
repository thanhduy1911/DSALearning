package math._3307_Find_The_K_th_Character_In_String_Game_II;

public class Main {
    public static void main(String[] args) {
        int[] operations = {0,0,0};
        int[] operations2 = {0,1,0,1};

        Solution solution = new Solution();
        System.out.println(solution.KthCharacter(5, operations));
        System.out.println(solution.KthCharacter(10, operations2));
    }
}
