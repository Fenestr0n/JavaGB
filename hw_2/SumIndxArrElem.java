package hw_2;

import java.util.Scanner;
/*
 * Дан массив целых чисел. Заменить отрицательные элементы на сумму индексов двузначных элементов массива.
 */
public class SumIndxArrElem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("N = ");
        int n = scanner.nextInt();
        int[] nums = new int[n];
        System.out.println("Numbers: ");
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scanner.nextInt();
            if (nums[i] > 9 && nums[i] < 100) {
                sum += i;
            }
        }
        scanner.close();
        System.out.println("Result:");
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                nums[i] = sum;
            }
            System.out.println(nums[i]);
        }
    }
}
