package main.problems.array._2404_Meeting_Rooms_III;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.mostBooked(2, new int[][]{{0, 10}, {1, 5}, {2, 7}, {3, 4}}));
        System.out.println(solution.mostBooked(3, new int[][]{{1, 20}, {2, 10}, {3, 5}, {4, 9}, {6, 8}}));
    }
}
