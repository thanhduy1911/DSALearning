package patterns.sort._414_Third_Maximum_Number;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void insert(long[] maxArray, int value) {
        int i = 0;
        while (i < maxArray.length) {
            if (value == maxArray[i]) return;
            else if (value > maxArray[i]) {
                break;
            } else { // value nho hon maxArray[i]
                i++;
            }
        }

        if (i < maxArray.length) {
            for (int j = maxArray.length - 2; j >= i; j--) {
                maxArray[j + 1] = maxArray[j];
            }
            maxArray[i] = value;
        }
    }
    public static int thirdMax(int[] nums) {
        long[] maxArray = {Long.MIN_VALUE, Long.MIN_VALUE, Long.MIN_VALUE};
        for (int num : nums) {
            insert(maxArray, num);
        }
        if (maxArray[2] == Long.MIN_VALUE) {
            return (int) maxArray[0];
        }

        return (int) maxArray[2];
    }
    public static void main(String[] args) {
        //System.out.println(thirdMax(new int[]{3,3,2,5,6,5}));
        System.out.println(thirdMax(new int[]{1,2,3}));
    }
}
