package cw_3;

import java.util.ArrayList;
import java.util.List;

/*
 * Дан массив объектов: фамилия студента, номер группы, размер стипендии, баллы по 3 предметам.
 * Определить стипендии студентов, фамилии которых заканчиваются на "ова", при четной сумме баллов.
 */

public class StudentMain {
    public static void main(String[] args) {
        Student st1 = new Student("Иванов", 2, 12000, List.of(3, 4, 5));
        Student st2 = new Student("Петров", 2, 10000, List.of(4, 4, 4));
        Student st3 = new Student("Сидоров", 1, 11000, List.of(3, 4, 3));
        Student st4 = new Student("Смирнова", 2, 15000, List.of(4, 5, 5));
        Student st5 = new Student("Павлова", 1, 13000, List.of(5, 4, 5));
        
        List<Student> allStudent = new ArrayList<>();
        allStudent.add(st1);
        allStudent.add(st2);
        allStudent.add(st3);
        allStudent.add(st4);
        allStudent.add(st5);

        for (Student student : allStudent) {
            if (strStudentEnd(student.getFio(), "ова")) {
                int sum = 0;
                for (Integer count : student.getCount()) {
                    sum += count;
                }
                if (sum % 2 == 0) {
                    System.out.println("Стипендия = " + student.getMoney());
                }
            }
        }

    }

    public static boolean strStudentEnd(String strName, String findStr) {
        int charCount = strName.length() - findStr.length();
        if (strName.substring(charCount).equals(findStr)) return true;
        return false;
    }
}
