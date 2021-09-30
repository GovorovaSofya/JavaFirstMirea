package ru.mirea.task3;

public class Book {
    String author;
    String name;
    int year;
    int page;
    int price;

    public Book (String theAuthor, String theName, int theYear, int thePage, int thePrice) {
        this.author = theAuthor;
        this.name = theName;
        this.year = theYear;
        this.page = thePage;
        this.price = thePrice;
    }
    public Book() {}

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String theAuthor) {
        this.author = theAuthor;
    }

    public String getName() {
        return name;
    }
    public void setName(String theName) {
        this.name = theName;
    }

    public int getYear() {
        return year;
    }
    public void setYear(int theYear) {
        this.year = theYear;
    }

    public int getPage() {
        return page;
    }
    public void setPage (int thePage) {
        this.page = thePage;
    }

    public int getPrice() {
        return price;
    }
    public void setPrice(int thePrice) {
        this.price = thePrice;
    }

    public String toString () {
        System.out.println("Автор: " + author + "\n" +
                "Название: " + name + "\n" +
                "Год издания: " + year + "\n" +
                "Кол-во страниц: " + page + "\n" +
                "Цена: " + price);
        return ".";
    }
}