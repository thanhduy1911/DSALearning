package main.patterns.array_hashing._1295_Find_Numbers_with_Even_Number_of_Digits;

public class Main {
    private static int findNumbers(int[] nums) {
        // Step 0. Initialize the return value
        // Step 1. Iterate array
        // Step 2. Check array[i] has how many digit
        // Step 3. Check array[i] is even digit
        // Step 4. Finally return the count of even digits

        int count = 0;
        for (int num : nums) {
            var digit = checkDigit(num);
            if (digit % 2 == 0) {
                count++;
            }
        }

        return count;
    }

    private static int checkDigit(int num) {
        int count = 0;
        while (num != 0) {
            num = num / 10;
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(findNumbers(new int[]{12,345,2,6,7896}));
        System.out.println(findNumbers(new int[]{555,901,482,1771}));
    }
}
