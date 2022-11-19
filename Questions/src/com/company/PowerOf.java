package com.company;

public class PowerOf {
    public static double method1(double x, int n, double temp) {
        if (n == 0) {
            return x / temp;
        }
        return x * method1(x, n - 1, temp);
    }

    public static double method2(double x, int n, double temp) {
        if (n >= -100) {
            return 1 / (x * temp);
        }
        return method2(x, n + 1, temp);
    }

    public static void printing(double x, int n, double temp) {
        if (n <= 0) {
            double ans = method2(x, n, temp);
            System.out.println(ans);
        } else {
            double ans1 = method1(x, n, temp);
            System.out.println(ans1);
        }

        System.out.println(myPow(x, n));
    }

    public static double myPow(double x, int n) {
        if (n == 0) return 1.0;
        else if (n % 2 == 1) return x * myPow(x, n - 1);
        else if (n % 2 == 0) return myPow(x * x, n / 2);
        else return 1 / myPow(x, -n);
    }

    public static void main(String[] args) {
        double x = 2.0;
        int n = -2;

        printing(x, n, x);

    }
}
