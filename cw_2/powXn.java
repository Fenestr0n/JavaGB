package cw_2;

import java.util.Scanner;

/*
 * Реализуйте функцию pow(x, n), которая вычисляет x в степени n.
Example 1:
Input: x = 2.00000, n = 10
Output: 1024.00000
 */
public class powXn {
    public static void main(String[] args) {
        double x;
        int n;
        double result = 1;
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextDouble();
        n = scanner.nextInt();
        scanner.close();
        if (n < 0) {
            x = 1 / x;
            n *= -1;
        }
        for (int i = 0; i < n; i++) {
            result *= x;
        }
        System.out.println("result = " + result);
    }
}
