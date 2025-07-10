package problems.array._3439_Reschedule_Meetings_for_Maximum_Free_Time_II;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maxFreeTime(5, new int[]{1, 3}, new int[] {2, 5}));
        System.out.println(solution.maxFreeTime(10, new int[]{0, 7, 9}, new int[] {1, 8, 10}));
        System.out.println(solution.maxFreeTime(5, new int[]{0, 3, 7, 9}, new int[] {1, 4, 8, 10}));
    }
}
