package ru.mirea.task3;

public class Human {
    public static void main(String[] args) {
        Head head1 = new Head("dark", "brown");
        Hand hand1 = new Hand(68, 15.2);
        Leg leg1 = new Leg(80, 25.5);

        Head head2 = new Head("blond", "green");
        Hand hand2 = new Hand(66, 14.1);
        Leg leg2 = new Leg(78, 24);

        System.out.println("Параметры тела человека: ");
        System.out.println("№1" + "\n" +
                head1.toString() + "\n" +
                hand1.toString() + "\n" +
                leg1.toString());

        System.out.println();

        System.out.println("№2" + "\n" +
                head2.toString() + "\n" +
                hand2.toString() + "\n" +
                leg2.toString());
    }
}
