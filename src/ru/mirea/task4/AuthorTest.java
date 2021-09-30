package ru.mirea.task4;

public class AuthorTest {
    public static void main(String[] args) {
        Author a1 = new Author("Alexander Sergeyevich Pushkin", "pushkin@yandex.ru", 'M');
        System.out.println(a1);
        Author a2 = new Author("Erich Maria Remarque", "e.m.remark@gmail.ru", 'M');
        a2.setEmail("e.m.remark@gmail.com");
        System.out.println(a2);
    }
}
