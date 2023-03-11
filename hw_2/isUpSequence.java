package hw_2;

import java.util.Scanner;

public class isUpSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("N = ");
        int n = scanner.nextInt();
        
        System.out.println("Sequence: ");
        int num = scanner.nextInt();
        
        boolean isUp = false;
        
        for (int i = 1; i < n; i++) {
            int num2 = scanner.nextInt();
            if (num < num2) {
                isUp = true;
            } else {
                isUp = false;
                break;
            }
            num = num2;
        }
        
        scanner.close();
        
        if (isUp) {
            System.out.println("Возрастающая последовательность");
        } else {
            System.out.println("Не возрастающая последовательность");
        }
    }
}
