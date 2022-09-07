package com.company;

public class ReverseANumber {
    public static int reverse(int x) {
        int n = x;
        int rev = 0;
        while (n != 0) {
            int digit = n % 10;

            //! IMPORTANT LINE
            if ((rev < Integer.MIN_VALUE / 10) || (rev > Integer.MAX_VALUE / 10)) {
                return 0;
            }
            rev = rev * 10 + digit;
            n = n / 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        int x = 1234;
        int ans = reverse(x);
        System.out.println(ans);
    }
}
