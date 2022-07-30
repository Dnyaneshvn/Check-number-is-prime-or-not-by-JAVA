package com.assignment;

import java.util.Scanner;

public class primeNum {
    // output is if value is prime then getting true otherwise false

    public static void main(String[] args) {

        boolean ans = isPrime();
        System.out.println(ans);

    }
    static boolean isPrime() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n <= 1) {
            return false;
        }
        int c = 2;
        while (c * c <= n) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }
        return c * c > n;
    }
}
