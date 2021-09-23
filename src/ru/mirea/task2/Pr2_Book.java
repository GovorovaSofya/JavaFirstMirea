package ru.mirea.task2;

public class Pr2_Book {
    String author;
    String name;
    int year;
    int price;

    //конструктор
    public Pr2_Book(String theAuthor, String theName, int theYear) {
        author = theAuthor;
        name = theName;
        year = theYear;
    }

    public Pr2_Book(String theAuthor, String theName) {
        author = theAuthor;
        name = theName;
    }

    public Pr2_Book() {
        author = "Рэй Брэдбери";
        name = "Вино из одуванчиков";
        year = 1957;
    }

    public void print_book() {
        System.out.println("Автор: " + author + "\n" + "Название книги: " + name + "\n" + "Год издания: " + year + "\n");
    }
}
