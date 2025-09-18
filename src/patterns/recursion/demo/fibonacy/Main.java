package patterns.recursion.demo.fibonacy;

public class Main {
    public static int fib(int n) {
        // Bai toan co so
        if (n <= 2) return 1;
        return fib(n - 1) + fib(n - 2);
    }
    public static void main(String[] args) {
        System.out.println(fib(4));
        System.out.println(fib(5));
    }
}
