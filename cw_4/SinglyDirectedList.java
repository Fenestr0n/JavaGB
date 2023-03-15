package cw_4;

import java.util.Arrays;
import java.util.LinkedList;

/*
 * Построить однонаправленный список целых чисел.
 * Найти сумму четных элементов списка.
 */
public class SinglyDirectedList {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        int sum = 0;
        for (int i = 0; i < linkedList.size(); i++) {
            if (linkedList.get(i) % 2 == 0) sum += linkedList.get(i);
        }
        System.out.println("Суммма четных элементов = " + sum);
    }
}
