package ru.mirea.task18;
import java.math.BigInteger;
import java.util.Scanner;

public class Buy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Введите номер ИНН");
            try{
                BigInteger inn =  new BigInteger(sc.nextLine());
                checkInn(inn);
                break;
            }catch (INN_no e){
                System.out.println(e.getLocalizedMessage());
            }
        }
        System.out.println("Данный ИНН действителен!");
    }

    public static boolean checkInn(BigInteger inn) throws INN_no{
        int i = 0;
        BigInteger custInn = new BigInteger(inn.toByteArray());
        while (!custInn.equals(new BigInteger("0"))){
            i++;
            custInn = new BigInteger(custInn.divide(new BigInteger("10")).toByteArray());
        }
        if(i != 10 && i != 12) throw new INN_no(inn);
        return true;
    }
}