package Lesson_08.HomeWork.Task1;

import java.util.Arrays;

public class Main {
//    1
//    Читатели библиотеки
//    Определить класс Reader, хранящий такую информацию о пользователе библиотеки:
//    ФИО, номер читательского билета, факультет, дата рождения, телефон.
//    Методы takeBook(), returnBook().
//    Разработать программу, в которой создается массив объектов данного класса.
//    Перегрузить методы takeBook(), returnBook():
//    - takeBook, который будет принимать количество взятых книг. Выводит на консоль сообщение "Петров В. В. взял 3 книги".
//    - takeBook, который будет принимать переменное количество названий книг.
//    Выводит на консоль сообщение "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".
//    - takeBook, который будет принимать переменное количество объектов класса Book (создать новый класс, содержащий имя и автора книги).
//    Выводит на консоль сообщение "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".
//    Аналогичным образом перегрузить метод returnBook().
//    Выводит на консоль сообщение "Петров В. В. вернул книги: Приключения, Словарь, Энциклопедия".
//    Или  "Петров В. В. вернул 3 книги".

    public static void main(String[] args) {
        Reader ivan = new Reader("Ivan V.V.", 345, "Журналистики", "04.11.1999", 323451754);
        Reader victor = new Reader("Victor B.B.", 345, "Медицинский", "04.11.1999", 323451754);

        Book book1 = new Book("Война и мир", "Толстой");
        Book book2 = new Book("Идиот", "Достоевский");
        Book book3 = new Book("1984", "Оурэлл");

        String[] ivanTakeTitleBook = {book1.getBookTitle(), book2.getBookTitle()};
        Book[] ivanTakeBook = {book1, book2};
        String[] victorReturnTitleBook = {book3.getBookTitle()};
        Book[] victorReturnBook = {book3};

        ivan.takeBook(ivanTakeTitleBook.length);
        ivan.takeBook(ivanTakeTitleBook);
        System.out.println();
        ivan.takeBook(ivanTakeBook);

        System.out.println();
        victor.returnBook(victorReturnBook.length);
        victor.returnBook(victorReturnTitleBook);
        System.out.println();
        victor.returnBook(victorReturnBook);


    }


}
