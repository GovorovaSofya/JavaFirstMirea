package ru.mirea.task22;

public class Client {
    public enum chair{
        Victorian,
        Multifunctional,
        Magic
    }
    private final Factory factory;
    public Client(Factory factory) {
        this.factory = factory;
    }

    public void sit(chair Chair_){
        Chair chair_ = factory.getChair(Chair_);
        System.out.println("You sit down a chair");
    }

    public static void main(String[] args) {
        Client client = new Client(new Factory());
        client.sit(chair.Victorian);
    }
}