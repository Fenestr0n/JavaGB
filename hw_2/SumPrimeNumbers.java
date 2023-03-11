package hw_2;

import java.util.Scanner;
/*
 * Дана последовательность N целых чисел. Найти сумму простых чисел.
 */
public class SumPrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("N = ");
        int n = scanner.nextInt();
        System.out.println("Numbers: ");
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            if (num > 0 && num % 1 == 0) {
                sum += num;
            }
        }
        scanner.close();
        System.out.println(sum);
    }
}
