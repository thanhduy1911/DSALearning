package problems.array._1295_Find_Numbers_with;

public class FindNumbersWithEvenNumberOfDigits {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            // check num in nums problems.array
            // if num is even --> count = count + 1
            int digit = checkDigit(num);
            if (digit % 2 == 0) count++;
        }

        return count;
    }

    private int checkDigit(int num) {
        int digit = 0;

        while (num > 0) {
            num = num / 10;
            digit++;
        }

        return digit;
    }


}
