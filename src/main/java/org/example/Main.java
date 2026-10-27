package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.math.BigInteger;
// Thuật toán Russian Peasant Multiplication em search StackOverflow
public class Main {
    static int multiply(int n, int m) {
        boolean negative = (n < 0) != (m < 0);

        long x = Math.abs((long) n);
        long y = Math.abs((long) m);
        long result = 0;

        while (y > 0) {
            if (y % 2 == 1) {
                result += x;
            }

            x += x;
            y /= 2;
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
