package ru.mirea.task3;

public class Leg {
    double legLength;
    double footLength; //длина стопы

    public Leg(double TheLegLength, double TheFootLength) {
        this.legLength = TheLegLength;
        this.footLength = TheFootLength;
    }

    public void setLegLength(double TheLegLength) {
        this.legLength = TheLegLength;
    }
    public double getLegLength() {
        return legLength;
    }

    public void setTheFootLength(double TheFootLength) {
        this.footLength = TheFootLength;
    }
    public double getWristWidth() {
        return footLength;
    }

    public String toString() {
        return ("Длина ноги: " + legLength + ", длина ступни: " + footLength);
    }
}
