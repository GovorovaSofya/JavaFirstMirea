package ru.mirea.task18;
import java.math.BigInteger;

public class INN_no extends Exception {

    private BigInteger innNum;

    public INN_no(BigInteger inn){
        super("Номер ИНН "+ inn + " не действителен!");
        innNum = inn;
    }

    public BigInteger getInnNum() {
        return innNum;
    }
}