package ru.mirea.task4;

public class BallTest {
    public static void main(String[] args) {
        Ball b1 = new Ball(100, 100);
        System.out.println(b1);
        b1.move(30,15);
        System.out.println(b1);

        Ball b2 = new Ball();
        b2.setXY(150, 185);
        System.out.println(b2);
        b2.move(-69,91);
        System.out.println(b2);
    }
}
