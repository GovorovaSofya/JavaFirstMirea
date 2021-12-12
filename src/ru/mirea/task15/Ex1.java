package ru.mirea.task15;
import java.io.*;

public class Ex1 {
    public static void main(String[] args) {
        try(FileWriter writer = new FileWriter("/Users/govor/OneDrive/учёба/Рабочий стол/file.txt", false))
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            String text = reader.readLine();
            writer.write(text);

            writer.flush();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}
