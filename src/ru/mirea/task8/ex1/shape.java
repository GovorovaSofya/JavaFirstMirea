package ru.mirea.task8.ex1;
import java.awt.*;
public abstract class shape
{
    protected Color color;
    protected Point pos;
    public shape(Color color, Point pos)
    {
        this.color = color;
        this.pos = pos;
    }
    public shape()
    {
        color = Color.BLACK;
    }
    public Point getPos()
    {
        return pos;
    }
    public void  setPos(Point pos)
    {
        this.pos = pos;
    }
    public abstract Color getColor();
}