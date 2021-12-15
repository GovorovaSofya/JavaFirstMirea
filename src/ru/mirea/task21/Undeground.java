package ru.mirea.task21;
import java.util.ArrayList;

public class Undeground<T> {
    private ArrayList<String> lines;
    private T t;

    public Undeground() {
        lines = new ArrayList<String>();

        lines.add("Sokolnicheskaya");
        lines.add("Zamoskvoreckaya");
        lines.add("Arbatsko-pokrovskaya");
        lines.add("Filevskaya");
        lines.add("Kolcevaya");
        lines.add("Butovskaya");
        lines.add("Tagansko-Krasnopresnyanskaya");
    }

    public void PrintList(boolean state) {
        for (int i = 0; i < lines.size(); i++) {
            if (state) {
                if (i % 2 == 0)
                    System.out.println("Линия: " + lines.get(i));
            } else if (i % 2 == 1)
                System.out.println("Линия: " + lines.get(i));
        }
    }
}

