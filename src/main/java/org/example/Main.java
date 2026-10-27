package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.math.BigInteger;
// Thuật toán Russian Peasant Multiplication em search StackOverflow
public class Main {
    static int multiply(int n, int m) {
        boolean negative = (n < 0) != (m < 0);

        long x = Math.min(Math.abs((long) n), Math.abs((long) m));
        long y = Math.max(Math.abs((long) n), Math.abs((long) m));
        long result = 0;

        for (long i = 0; i < x; i++) {
            result += y;
        }

        if (negative) {
            result = -result;
        }

        return Math.toIntExact(result);
    }

    public static void main(String[] args) {
        System.out.println(multiply(2, 3));    // 6
        System.out.println(multiply(-2, 3));   // -6
        System.out.println(multiply(-2, -3));  // 6
        System.out.println(multiply(2, -3));   // -6
    }
}
