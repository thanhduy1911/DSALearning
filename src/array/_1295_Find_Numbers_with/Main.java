package array._1295_Find_Numbers_with;

public class Main {
    public static void main(String[] args) {
        // 1295. Find Numbers with Even Number of Digits
        // Test case
        int[] nums = {12,345,2,6,7896};
        int[] nums2 = {555,901,482,1771};

        _1295_FindNumbersWithEvenNumberOfDigits result = new _1295_FindNumbersWithEvenNumberOfDigits();

        System.out.println("Numbers With Even Number Of Digits: " + result.findNumbers(nums));
        System.out.println("Numbers With Even Number Of Digits: " + result.findNumbers(nums2));
    }
}
