package ru.mirea.task13;
import java.util.Scanner;

public class Number3_Test {
    public static void main(String[] args) {
        Number3_MyArrayList<Integer> myArrayList = new Number3_MyArrayList<Integer>();

        System.out.println("Ввод 10 элементов в ArrayList");

        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("\nArrayList[" + i + "] = ");
            myArrayList.add(in.nextInt());
        }
        System.out.print('\n');

        System.out.print("\nВведите индекс для вывода значения: ");
        System.out.println("\n value = " + myArrayList.get(in.nextInt()));
    }
}
