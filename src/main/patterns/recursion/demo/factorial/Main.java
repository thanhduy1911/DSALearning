package main.patterns.recursion.demo.factorial;

public class Main {
    public static int factorial(int n) {
        // dieu kien dung
        if (n == 0) return 1;
        // bai toan co so lap di lap lai (de quy)
        return n * factorial(n - 1);
    }
    public static void main(String[] args) {
        System.out.println(factorial(4));
    }
}
