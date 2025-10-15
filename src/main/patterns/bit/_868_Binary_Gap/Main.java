package main.patterns.bit._868_Binary_Gap;

public class Main {
    public static int binaryGap (int n) {
        int res = 0;
        String sBinary = Integer.toBinaryString(n);
        System.out.println(sBinary);
        int count = 0;
        boolean isOpen = false;

        for (int i = 0; i < sBinary.length(); i++) {
            if (sBinary.charAt(i) == '1') {
                if (isOpen) {
                    res = Math.max(res, count);
                }
                count = 1;
                isOpen = true;
            } else if (sBinary.charAt(i) == '0' && isOpen) {
                count++;
            }
        }

        return res;
    }
    public static void main(String[] args) {
        System.out.println(binaryGap(1041));
        System.out.println(binaryGap(22));
        System.out.println(binaryGap(5));
        System.out.println(binaryGap(8));
        System.out.println(binaryGap(13));
    }
}
