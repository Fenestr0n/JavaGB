package hw_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
 * Дана последовательность N целых чисел. Найти сумму простых чисел.
 */


public class SumPrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длину последовательности: ");
        int n = scanner.nextInt();
        scanner.close();

        // Решето Эратосфена:
        IntStream stream = IntStream.range(1, n + 1);
        int[] nums = stream.toArray();
        nums[1] = 0;
        
        // int[] primes = new int[n];
        int[] primes;
        int i = 2;

        while (i <= n) {
            if (nums[i] != 0) {
                primes.append(nums[i]);
                primes.add(nums[i]);
                primes[nums[i]];

        // Ну и как добавить элемент в массив?
        
        
        // *Python*
        //         primes.append(num[i])
        //         for j in range(i, n+1, i):
        //             a[j] = 0
        //      i += 1
        // print(sum(primes))

                
            }
        }
    }
}
