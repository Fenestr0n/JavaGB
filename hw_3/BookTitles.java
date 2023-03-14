package hw_3;

import java.util.ArrayList;
import java.util.List;

/*
 * Сведения о книге состоят из названия, фамилии автора, цены, года издания и количества страниц. 
 * Найти названия книг, в которых простое количество страниц, 
 * фамилия автора содержит «а» и год издания после 2010 г, включительно.
 */
public class BookTitles {
    public static void main(String[] args) {
        Book book1 = new Book("Властелин колец", "Толкин", 1699, 2019, 1312);
        Book book2 = new Book("Хоббит", "Толкин", 902, 2018, 320);
        Book book3 = new Book("Макбет", "Шекспир", 50, 1623, 60);
        Book book4 = new Book("Старик и море", "Хемингуэй", 179, 1952, 170);
        Book book5 = new Book("Братья Карамазовы", "Достоевский", 215, 1881, 1140);
        Book book6 = new Book("Дорога", "Маккарти", 279, 2016, 223);
        Book book7 = new Book("Призрачная будка", "Джастер", 785, 2018, 211);

        List<Book> Books = new ArrayList<>();
        Books.add(book1);
        Books.add(book2);
        Books.add(book3);
        Books.add(book4);
        Books.add(book5);
        Books.add(book6);
        Books.add(book7);

        for (Book book : Books) {
            if (isSimple(book.getPages()) && findLetter(book.getAuthor(), "а") && book.getYear() >= 2010) {
                System.out.println(book.getName());
            }
        }
    }
    public static boolean findLetter(String strName, String findStr) {
        if (strName.contains(findStr)) return true;
        return false;    
    }

    public static boolean isSimple(Integer number) {
        if(number < 2) return false;
        for(int i = 2; i <= Math.sqrt(number); i++) {
            if(number % i == 0) return false;
        }
        return true;
    }
}
