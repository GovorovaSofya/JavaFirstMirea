package ru.mirea.task8.ex1;
import javax.swing.*;
import java.awt.*;

public class main extends JFrame
{
    public main() {

        setLayout(null);
        setSize(1500,1000);
        setVisible(true);
    }
    public  void paint(Graphics graphic)
    {
        super.paint(graphic);
        for(int i = 0; i < 20; i++)
        {
            int R = (int)(Math.random()*256);
            int G = (int)(Math.random()*256);
            int B = (int)(Math.random()*256);
            int n = (int)(Math.random()*3);
            switch (n)
            {
                case 0:
                {
                    circle circle = new circle(i*40, i*40, (int)(Math.random()*40+5),new Color(R,G,B));
                    graphic.setColor(circle.getColor());
                    graphic.drawOval((int) circle.getX(), (int) circle.getY(), circle.getRadius(), circle.getRadius());
                    break;
                }
                case 1:
                {
                    rectangle rect = new rectangle(i*50, i*40, (int)(Math.random()*30+2), (int)(Math.random()*30+7),new Color(R,G,B));
                    graphic.setColor(rect.getColor());
                    graphic.drawRect((int) rect.getX(), (int) rect.getY(), rect.getWidth(), rect.getHeight());
                    break;
                }
                case 2:
                {
                    square sq = new square(i*30, i*40, (int)(Math.random()*60+4), new Color(R,G,B));
                    graphic.setColor(sq.getColor());
                    graphic.drawRect((int) sq.getX(), (int) sq.getY(), sq.getSide(), sq.getSide());
                    break;
                }
                default: break;
            }
        }
    }
    public static void main(String[] args)
    {
        main m = new main();
    }
}