package hw_1;

import java.util.Scanner;
/*
* Дана последовательность целых чисел, оканчивающаяся нулем. Найти сумму положительных чисел, после которых следует отрицательное число.
* Пример: 1 2 1 2 -1 1 3 1 3 -1 0 
* 2 -1 переход 2 в сумму
* 3 -1 переход 3 в сумму
* суммарно выведет 5
*/
public class SumNumAfterNegative {
    public static void main(String[] args) {
        boolean isNegative = false;
        int summ = 0;

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        String[] strArray = str.split(" ");
        int[] intArray = new int[strArray.length];
        
        for(int i = 0; i < strArray.length; i++) {
            intArray[i] = Integer.parseInt(strArray[i]);
        }
        
        for (int i = intArray.length - 1; i >= 0; --i) {
            if (intArray[i] < 0) {
                isNegative = true;
            } else if (intArray[i] > 0 && isNegative) {
                summ += intArray[i];
                isNegative = false;
            }
        }
        System.out.println(summ);
    }
}
    