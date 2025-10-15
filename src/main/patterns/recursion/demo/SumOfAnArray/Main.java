package main.patterns.recursion.demo.SumOfAnArray;

public class Main {
    public static void printElement(int[] array, int index) {
        // bai toan co so
        if (index < 0 || index >= array.length) return;
        // cong thuc quy nap; in phan tu index, print index + 1
        System.out.println(array[index]);
        printElement(array, index + 1);
    }
    public static void printElementFromN(int[] array, int index) {
        if (index < 0 || index >= array.length) return;
        printElementFromN(array, index + 1);
        System.out.println(array[index]);
    }
    public static void main(String[] args) {
        printElement(new int[] {0,1,2,3,4,5,6,7,8,9}, 0);
        printElementFromN(new int[] {0,1,2,3,4,5,6,7,8,9}, 0);
    }
}
