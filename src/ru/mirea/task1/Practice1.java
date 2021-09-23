package ru.mirea.task1;//package com.company;
import java.util.Scanner;
public class Practice1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //exercise1
        int sum = 0;

        System.out.println("Упражнение 1.");
        int arr1[] = new int[6];
        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = in.nextInt();
            sum = sum + arr1[i];
        }
        System.out.println("Сумма элементов массива (через цикл for): " + sum);
        sum = 0;

        int i = 0;
        while (i < arr1.length) {
            sum = sum + arr1[i];
            i++;
        }
        System.out.println("Сумма элементов массива (через цикл while): " + sum);
        sum = 0;

        i=0;
        do {
            sum = sum + arr1[i];
            i++;
        }
        while (i < arr1.length);
        System.out.println("Сумма элементов массива (через цикл do while): " + sum + "\n");

        //exercise2
        System.out.println("Упражнение 2.");
        for (String str : args) {
            System.out.println("Аргумент " + str);
        }
        System.out.println("\n");

        //exercise3
        System.out.println("Упражнение 3." + "\n" + "Гармонический ряд первых 10 чисел: ");
        for (i=1; i<11; i++) {
            System.out.print("1/" + i + " " );
        }
        System.out.println("\n");

        //exercise4
        System.out.println("Упражнение 4.");
        long a = -1000, b = 2000;
        int n;
        System.out.print("Введите кол-во элементов массива:" + "\n");
        n = in.nextInt();
        long arr[] = new long[n];
        for (i=0; i<n; i++) {
            arr[i] = (int) (Math.random()*(b-a)+a);
        }

        System.out.println("Исходный массив:  ");

        for (i=0; i<n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for (i = arr.length-1; i>0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    long t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }
        System.out.println("Отсортированный массив:  ");

        for (i=0; i<n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");

        System.out.println("Упражнение 5.");
        int s;
        System.out.print("Введите число у которого нужно посчитать факториал:" + "\n");
        n = in.nextInt();
        System.out.println("Факториал: " + fact(n));

    }

    public static int fact(int a) {
        int f = 1;
        for (int i = 1; i <= a; i++) {
            f = i * f;
        }
        return f;
    }
}
