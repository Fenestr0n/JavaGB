package cw_4;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            linkedList.add(i);
        }
        scanner.close();

        // Показать элемент
        System.out.println(linkedList.peek());
        System.out.println("peek: " + linkedList);

        // Достать элемент
        System.out.println(linkedList.pop());
        System.out.println("pop: " + linkedList);

        // Добавить элемент в начало
        linkedList.addFirst(3);
        System.out.println("addFirst: " + linkedList);
        
        // Добавить элемент в конец
        linkedList.addLast(4);
        System.out.println("addLast: " + linkedList);

        // Добавить элемент в конец
        System.out.println(linkedList.add(8));
        System.out.println("add: " + linkedList);

        // Замена элементов
        System.out.println(linkedList.set(0, 7));
        System.out.println("set 7: " + linkedList);

        // Проверка на наличие элемента
        System.out.println(linkedList.contains(7));
        System.out.println("contains: " + linkedList);

        // Удаление элемента
        System.out.println(linkedList.remove(4));
        System.out.println("remove: " + linkedList);

    }
}
