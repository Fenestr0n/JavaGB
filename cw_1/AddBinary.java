package cw_1;
/*
 * Имея две двоичные строки a и b, верните их сумму в виде двоичной строки.
 * 
 * Example 1:
 * Input: a = "11", b = "1"
 * Output: "100"
 * 
 * Example 2:
 * Input: a = "1010", b = "1011"
 * Output: "10101"
 *
 * Ограничения:
 * 1 <= a.length, b.length <= 104
 * a и b состоят только из символов «0» или «1».
 * Каждая строка не содержит ведущих нулей, кроме самого нуля.
 */

public class AddBinary {
     public static void main(String[] args) {
        System.out.println(solution("11", "1"));
     }

     public static String solution(String a, String b) {
        if (a.length() < b.length()) {
            return solution(b, a);
        }
        String res = "";
        int k = 0;
        int j = b.length() - 1;
        for (int i = a.length() - 1; i >= 0; i--) {
            if (a.charAt(i) == '1') {
                k++;
            }
            if (j >= 0 && b.charAt(j) == '1') {
                k++;
            }
            res = k % 2 + res;
            j--;
            k /= 2;
        }
        if (k > 0) {
            res = k + res;
        }
        return res;
     }
}
