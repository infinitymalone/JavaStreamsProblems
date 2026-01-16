package utils;

import java.util.Date;

public class Transactions {
    @Override
    public String toString() {
        return amount + " - " + day;
    }

    public Transactions(long amount, Date day) {
        this.amount = amount;
        this.day = day;
    }

    private final long amount;

    public Date getDay() {
        return day;
    }

    public long getAmount() {
        return amount;
    }

    private final Date day;

}
