package test;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /// Input: 1. float[][], 2. float[]
        /// Output: return ve int. int la index cua hcn gan nhat
        /// example: [[1.21, 3.21, 2.21, 5.21], [4.2, 6.7], [2.7, 8.4]]
        ///          [3.1, 5.2]


    }

    private static int test1(float[][] rectangles, float[] userPoint) {
        int index = 0;
        Arrays.sort(rectangles);
        for (float[] rectangle : rectangles) {
            float x = rectangle[2] - rectangle[0];
            float y = rectangle[3] - rectangle[1];
            float diagonal = x * x + y * y;
            diagonal = diagonal / 2;
            float diagonalUserPoint = userPoint[0] * userPoint[0] + userPoint[1] * userPoint[1];
            diagonalUserPoint /= 2;

            // check distance of userPoint and most closest rectangle
            if (diagonal - diagonalUserPoint > 0) {
                index = (int) Math.min(index, diagonal - diagonalUserPoint);
            }
        }

        return index;
    }
}
