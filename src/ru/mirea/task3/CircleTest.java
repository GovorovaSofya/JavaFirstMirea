package ru.mirea.task3;

import java.util.Scanner;

public class CircleTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Circle c1 = new Circle();
        c1.setR(7);
        System.out.println("Радиус: " + c1.getR() + "\n" +
                "Диаметр: " + c1.getD() + "\n" +
                "Площадь: " + c1.Area() + "\n" +
                "Длина: " + c1.Length());

        System.out.println();

        Circle c2 = new Circle();
        c2.setR(5);
        System.out.println("Радиус: " + c2.getR() + "\n" +
                "Диаметр: " + c2.getD() + "\n" +
                "Площадь: " + c2.Area() + "\n" +
                "Длина: " + c2.Length());
    }
}
