package ru.mirea.task2;

public class Pr2_Dog {
    private String name;
    private int age_month;
    float weight_kg;
    String color;

    public Pr2_Dog (String theName, int age) {
        name = theName;
        age_month = age;
    }

    public Pr2_Dog (String theName) {
        name = theName;
        age_month = 0;
    }

    public Pr2_Dog () {
        name = "Buch";
        age_month = 1;
    }

    public void setAge(int age) {
        this.age_month = age;
    }

    public int getAge() {
        return age_month;
    }

    public void setName(String theName) {
        this.name = theName;
    }

    public String getName(String theName) {
        return name;
    }

    public void setColor(String theColor) {
        this.color = theColor;
    }

    public String getColor() {
        return color;
    }

    public void setWeight(float theWeight) {
        this.weight_kg = theWeight;
    }

    public float getWeight() {
        return weight_kg;
    }

    public String toString() {
        return this.name + ", age " + this.age_month + ", color: " + color + ", weight: " + weight_kg;
    }

    public void intoHumanAge() {
        System.out.println(name + " 's age " + age_month + " month in human years is " + age_month*7 + " years");
    }

}
