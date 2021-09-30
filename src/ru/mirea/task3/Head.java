package ru.mirea.task3;

public class Head {
    String hair;
    String eyes;

    public Head (String theHair, String theEyes){
        this.hair = theHair;
        this.eyes = theEyes;
    }

    public void setHair(String theHair) {
        this.hair = theHair;
    }
    public String getHair() {
        return hair;
    }

    public void setEyes(String theEyes) {
        this.eyes = theEyes;
    }
    public String getEyes() {
        return eyes;
    }

    public String toString() {
        return ("Цвет волос: " + hair + ", цвет глаз: " + eyes);
    }
}
