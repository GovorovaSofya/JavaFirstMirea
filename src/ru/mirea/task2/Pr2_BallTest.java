package ru.mirea.task2;

public class Pr2_BallTest {
    public static void main(String[] args) {
        Pr2_Ball b1 = new Pr2_Ball("Nike", "voleyball", 1290f ,"yellow");
        Pr2_Ball b2 = new Pr2_Ball();
        Pr2_Ball b3 = new Pr2_Ball("Puma", "basketball");
        b3.setPrice(2699f);
        Pr2_Ball b4 = new Pr2_Ball(799.99f);
        b4.color = "green";
        b4.activity = "tennis";

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
    }

}
