package ru.mirea.task2;

public class Pr2_Shape {
    private String name;
    private int area;

    public Pr2_Shape(String theName, int theArea) {
        this.name = theName;
        this.area = theArea;
    }

    public Pr2_Shape(String theName) {
        this.name = theName;
        area = 0;
    }

    public Pr2_Shape(int theArea) {
        name = " ";
        this.area = theArea;
    }

    public Pr2_Shape() {
        name = " ";
        area = 0;
    }

    public void setName(String theName) {
        this.name = theName;
    }

    public void setArea(int theArea) {
        this.area = theArea;
    }

    public String getName() {
        return name;
    }

    public int getArea() {
        return area;
    }

    public String toString() {
        return this.name+", area: "+ this.area;
    }
}