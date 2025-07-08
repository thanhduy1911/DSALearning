package array._1751_Maximum_Number_Of_Events_That_Can_Be_Attended_II;

public class Main {
    public static void main(String[] args) {
        int[][] events = {
                {1,2,4},
                {3,4,3},
                {2,3,1}
        };
        int[][] events2 = {
                {1,2,4},
                {3,4,3},
                {2,3,10}
        };
        int[][] events3 = {
                {1,1,1},
                {2,2,2},
                {3,3,3},
                {4,4,4}
        };

        Solution solution = new Solution();
        System.out.println(solution.maxValue(events, 2));
        System.out.println(solution.maxValue(events2, 2));
        System.out.println(solution.maxValue(events3, 3));
    }
}
