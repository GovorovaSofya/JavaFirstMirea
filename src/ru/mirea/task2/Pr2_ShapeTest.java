package ru.mirea.task2;

public class Pr2_ShapeTest {
    public static void main(String[] args) {
        Pr2_Shape s1 = new Pr2_Shape("Circle", 8);
        Pr2_Shape s2 = new Pr2_Shape("Square");
        Pr2_Shape s3 = new Pr2_Shape("Triangle", 4);
        Pr2_Shape s4 = new Pr2_Shape();

        s2.setArea(5);
        System.out.println(s1);
        s4.setArea(6);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
    }
}