package ru.mirea.task2;

import ru.mirea.task2.Pr2_Dog;

public class Pr2_DogTest {
    public static void main(String[] args) {
        Pr2_Dog d1 = new Pr2_Dog("Pike", 2); //объект Пайк, который явл. объектом класса Собака
        d1.color = "white, brown, black";
        d1.setWeight(2.2f);

        Pr2_Dog d2 = new Pr2_Dog("Melly", 7);
        d2.weight_kg = 4f;
        d2.color = "white";

        Pr2_Dog d3 = new Pr2_Dog("Jossy");
        d3.setAge(6);

        Pr2_Dog d4 = new Pr2_Dog();
        d4.color = "black and white";

        System.out.println(d1);
        System.out.println(d3);
        System.out.println(d4);
        System.out.println();

        d1.intoHumanAge();
        d2.intoHumanAge();
        d3.intoHumanAge();
        d4.intoHumanAge();
        //  System.out.println(melly.weight_kg);
    }

}
