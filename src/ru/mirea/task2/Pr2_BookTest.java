package ru.mirea.task2;

import ru.mirea.task2.Pr2_Book;

public class Pr2_BookTest {
    public static void main(String[] args) {
        Pr2_Book b1 = new Pr2_Book("Толстой Л.Н.", "Война и мир", 1867);
        Pr2_Book b2 = new Pr2_Book("Булгаков М.А", "Мастер и Маргарита");
        Pr2_Book b3 = new Pr2_Book();

        b1.print_book();

        b2.year = 1967;
        b2.print_book();

        b3.print_book();
    }
}
