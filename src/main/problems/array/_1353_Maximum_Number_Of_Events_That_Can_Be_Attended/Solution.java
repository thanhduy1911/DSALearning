package main.problems.array._1353_Maximum_Number_Of_Events_That_Can_Be_Attended;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution {
    public int maxEvents(int[][] events) {
        // Step 1: Sort theo startDay tăng dần
        Arrays.sort(events, Comparator.comparingInt(o -> o[0]));

        int day = 0, index = 0, n = events.length, result = 0;

        // PriorityQueue: min heap theo endDay
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Mỗi vòng lặp = 1 ngày
        while (!pq.isEmpty() || index < n) {
            // Nếu không có event nào đang chờ -> nhảy tới startDay tiếp theo
            if (pq.isEmpty()) {
                day = events[index][0];
            }

            // Thêm tất cả event bắt đầu ngày hôm nay hoặc trước đó
            while (index < n && events[index][0] <= day) {
                pq.offer(events[index][1]); // add endDay vào heap
                index++;
            }

            pq.poll(); // attend event end sớm nhất
            result++;
            day++; // sang ngày tiếp theo

            // Xóa event đã hết hạn
            while (!pq.isEmpty() && (pq.peek() < day)) {
                pq.poll();
            }
        }

        return result;
    }
}
