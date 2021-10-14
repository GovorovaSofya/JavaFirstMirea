package ru.mirea.task5.ex3;

public class TestFurniture {
    public static void main(String[] args) {
        Furniture sofa1 = new Sofa("жёлтый", "220x90", 15999);
        System.out.println(sofa1.toString());

        Furniture chair1 = new Chair("коричневый", "M", 1269);
        System.out.println(chair1.toString());
    }

}
