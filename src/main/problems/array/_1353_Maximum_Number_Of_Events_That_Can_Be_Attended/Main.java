package main.problems.array._1353_Maximum_Number_Of_Events_That_Can_Be_Attended;

public class Main {
    public static void main(String[] args) {
        int[][] events = { {1,2}, {2,3}, {3,4} };
        int[][] events2 = { {1,2}, {2,3}, {3,4}, {1,2} };

        Solution solution = new Solution();
        System.out.println(solution.maxEvents(events));
        System.out.println(solution.maxEvents(events2));
    }
}
