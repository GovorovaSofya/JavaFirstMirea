package ru.mirea.task5.ex3;

public class Sofa extends Furniture {
    private String color;
    private String size;
    private int price;

    public Sofa(String color, String size, int price) {
        name = "Диван";
        this.color = color;
        this.size = size;
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    @Override
    public String getColor() {
        return color;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String getSize() {
        return size;
    }

    public String toString() {
        return "Тип мебели: " + name + ", цвет: " + color + ", размер: " + size + ", цена: " + price;
    }
}
