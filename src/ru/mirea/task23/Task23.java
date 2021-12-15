package ru.mirea.task23;
import java.util.Objects;

public class Task23{
    private int width;
    private int height;
    private int uniqueID;

    public Task23(int width, int height, int uniqueID){
        this.height = height;
        this.width = width;
        this.uniqueID = uniqueID;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public int getUniqueID() {
        return uniqueID;
    }

    public int getWidth() {
        return width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setUniqueID(int uniqueID) {
        this.uniqueID = uniqueID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task23 task = (Task23) o;
        return uniqueID == task.uniqueID;
    }

    @Override
    public int hashCode() {
        return Objects.hash(uniqueID);
    }

    public static void main(String[] args) {
        Task23 obj1 = new Task23(10,10,1000);
        Task23 obj2 = new Task23(10,20,1001);
        Task23 obj3 = new Task23(20,10,1002);
        Task23 obj4 = new Task23(10,10,1003);
        Task23 obj5 = new Task23(10,10,1000);
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
        System.out.println(obj3.hashCode());
        System.out.println(obj4.hashCode());
        System.out.println(obj5.hashCode());
        System.out.println("Сравнение obj1 и obj2: " + obj1.equals(obj2));
        System.out.println("Сравнение obj1 и obj3: " + obj1.equals(obj3));
        System.out.println("Сравнение obj1 и obj4: " + obj1.equals(obj4));
        System.out.println("Сравнение obj1 и obj5: " + obj1.equals(obj5));
    }
}