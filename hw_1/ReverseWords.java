package hw_1;

import java.util.Scanner;


/**
 * 151. Обратить слова в строке
 * Учитывая входную строку s, измените порядок слов на противоположный.
 * Слово определяется как последовательность не пробельных символов. Слова в s будут разделены хотя бы одним пробелом.
 * Возвратить строку слов в обратном порядке, объединенных одним пробелом.
 * Обратите внимание, что s может содержать начальные или конечные пробелы или несколько пробелов между двумя словами.
 * Возвращаемая строка должна содержать только один пробел, разделяющий слова. 
 * Не включайте никаких дополнительных пробелов.
 * 
 * Пример 1:
 * Input: s = "the sky is blue"
 * Output: "blue is sky the"
 * 
 * Пример 2:
 * Input: s = "  hello world  "
 * Output: "world hello"
 * Объяснение: Ваша перевернутая строка не должна содержать начальных или конечных пробелов.
 * 
 * Пример 3:
 * Input: s = "a good   example"
 * Output: "example good a"
 * Объяснение: Вам нужно сократить несколько пробелов между двумя словами до одного пробела в перевернутой строке.
 */

public class ReverseWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] array = s.split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = array.length - 1; i >= 0; --i) {
            if (!array[i].equals("")) {
                sb.append(array[i]).append(" ");
            }
        }

        if (sb.length() == 0) {
            System.out.println("");
        } else {
            // Удалить последний пробел
            System.out.println(sb.substring(0, sb.length() - 1));
        }
    }
}