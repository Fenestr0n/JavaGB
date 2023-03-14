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
            if (isPrimeNumber(num)) {
                sum += num;
            }
        }
        scanner.close();
        System.out.println(sum);
        }

    public static boolean isPrimeNumber(Integer number) {
        if(number < 2) return false;
        for(int i = 2; i <= Math.sqrt(number); i++) {
            if(number % i == 0) return false;
        }
        return true;
    }
}
