package ru.mirea.task3;
import static java.lang.Math.*;

public class Circle {
    public double r;
    public double d;

    public void setR (double theR) {
        this.r = theR;
        this.d = 2*r;
    }
    public double getR () {
        return r;
    }

    public double getD () {
        return d;
    }

    public double Area () {
        return (Math.PI*PI*r);
    }

    public double Length () {
        return (Math.PI*r*2);
    }
}
