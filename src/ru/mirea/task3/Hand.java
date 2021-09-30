package ru.mirea.task3;

public class Hand {
    double armLength;
    double wristWidth; //ширина запястья

    public Hand(double TheArmLength, double TheWristWidth) {
        this.armLength = TheArmLength;
        this.wristWidth = TheWristWidth;
    }

    public void setArmLength(double TheArmLength) {
        this.armLength = TheArmLength;
    }
    public double getArmLength() {
        return armLength;
    }

    public void setWristWidth(double TheWristWidth) {
        this.wristWidth = TheWristWidth;
    }
    public double getWristWidth() {
        return wristWidth;
    }

    public String toString() {
        return ("Длина руки: " + armLength + ", ширина запястья: " + wristWidth);
    }
}
