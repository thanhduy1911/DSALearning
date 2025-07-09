package problems.array._3439_Reschedule_Meetings_for_Maximum_Free_Time_I;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maxFreeTime(5, 1, new int[]{1, 3}, new int[] {2, 5}));
        System.out.println(solution.maxFreeTime(10, 1, new int[]{0, 2, 9}, new int[] {1, 4, 10}));
        System.out.println(solution.maxFreeTime(5, 2, new int[]{0, 1, 2, 3, 4}, new int[] {1, 2, 3, 4, 5}));
    }
}
