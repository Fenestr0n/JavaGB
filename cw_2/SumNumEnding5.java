package cw_2;

import java.util.Scanner;
/*
 * Дана последовательность из N целых чисел. Найти сумму чисел, оканчивающихся на 5,
 * перед которыми идет четное число.
 */
public class SumNumEnding5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("N = ");
        int n = scanner.nextInt();
        System.out.println("Numbers: ");
        int num = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i < n; i++) {
            int num2 = scanner.nextInt();
            if (num2 == 0 && num2 % 10 == 5) {
                sum += num2;
            }
            num = num2;
        }
        scanner.close();
        System.out.println(sum);
    }
}
