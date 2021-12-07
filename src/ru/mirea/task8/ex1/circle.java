package ru.mirea.task8.ex1;
import java.awt.*;

public class circle extends shape {
    protected int radius;
    public circle(int x, int y, int radius, Color color)
    {
        this.radius = radius;
        this.color = color;
        this.pos = new Point(x,y);
    }
    public int getRadius()
    {
        return radius;
    }
    public double getX()
    {
        return pos.getX();
    }
    public double getY()
    {
        return pos.getY();
    }
    @Override
    public Color getColor()
    {
        return color;
    }
}