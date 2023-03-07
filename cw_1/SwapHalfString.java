package cw_1;
/*
 * Дана строка. Поменять местами ее половины.
 */

import java.util.Scanner;

public class SwapHalfString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        StringBuilder myNewStr = new StringBuilder();
        myNewStr.append(str.substring(str.length() / 2, str.length()))
                .append(str.substring(0, str.length() / 2));
        System.out.println(myNewStr.toString());
    }
}
