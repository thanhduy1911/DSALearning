package patterns.recursion._50_MyPow;

public class Main {
    public static double pow(double x, long n) {
        if (n == 0) return 1;

        if (n == 1) return x;

        if (n < 0) {
            x = 1 / x;
            n = -n;
        }

        if (n % 2 == 0) return pow(x * x, n / 2);

        return x * pow(x, n - 1);
    }
    public static double myPow(double x, int n) {
        return pow(x, n);
    }
    public static void main(String[] args) {
        System.out.println(myPow(2.0, 3));
        System.out.println(myPow(2.0, 2));
        System.out.println(myPow(2.00000, -2147483648));
    }
}
