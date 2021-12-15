package ru.mirea.task21;

public class Main_Undeground {
    public static void main(String[] args) {
        Undeground lines = new Undeground();
        System.out.println("Нечетные линии метро: ");
        lines.PrintList(true);
        System.out.println("Четные линии метро: ");
        lines.PrintList(false);
    }
}
