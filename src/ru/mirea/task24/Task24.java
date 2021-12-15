package ru.mirea.task24;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task24 {
    public static void main(String[] args) {
        String regex = "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)";
        Pattern pattern = Pattern.compile(regex);

        System.out.println("Введите ip адрес для проверки: ");
        Scanner sc = new Scanner(System.in);
        String ip = sc.next();
        Matcher matcher = pattern.matcher(ip);
        System.out.println(ip +" : "+ matcher.matches());
    }
}