package ru.mirea.task2;

public class Pr2_Ball {
    private String brand;
    private float price;
    String color;
    String activity;

    public Pr2_Ball (String theBrand, String theActivity, float thePrice, String theColor) {
        brand = theBrand;
        activity = theActivity;
        price = thePrice;
        color = theColor;
    }

    public Pr2_Ball (String theBrand, String theActivity) {
        brand = theBrand;
        activity = theActivity;
    }

    public Pr2_Ball (float thePrice) {
        price = thePrice;
    }

    public Pr2_Ball () {
        brand = "Demiks";
        activity = "football";
        price = 599f;
        color = "white and black";
    }

    public void setBrand(String theBrand) {
        this.brand = theBrand;
    }

    public String getBrand() {
        return brand;
    }

    public void setActivity(String theActivity) {
        this.activity = theActivity;
    }

    public String getActivity(String theActivity) {
        return activity;
    }

    public void setPrice(float thePrice) {
        this.price = thePrice;
    }

    public float getPrice() {
        return price;
    }

    public void setColor(String theColor) {
        this.color = theColor;
    }

    public String getColor() {
        return color;
    }

    public String toString() {
        return this.brand + " brand ball, activity: " + this.activity + ", price: " + this.price + ", color: " + color;
    }
}
