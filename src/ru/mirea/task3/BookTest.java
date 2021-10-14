package ru.mirea.task3;

public class BookTest {
    public static void main(String[] args) {
        Book b1 = new Book("Булгаков М.А", "Мастер и Маргарита", 1962, 512, 812);
        Book b2 = new Book();
        b2.author = "Рэй Брэдбери";
        b2.name = "Вино из одуванчиков";
        b2.year = 1957;
        b2.page = 384;
        b2.price = 193;
        b1.toString();
        System.out.println();
        b2.toString();
    }
}