//package ru.mirea.task10;
//import java.util.Scanner;
//
//
//public class Number6 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println();
//        System.out.println("Task 6");
//        System.out.print("Введите n>1: ");
//        int n = scanner.nextInt();
//        System.out.println();
//        System.out.println("Число " + n + " простое: " + isPrime(n));
//    }
//
//    static String isPrime(int n) {
//        if (n < 2) return "NO";
//        for (int i = 2; i * i <= n; i++)
//            if (n % i == 0) return "NO";
//        return "YES";
//    }
//}