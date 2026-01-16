package levelHard2;

import utils.Transactions;

import java.util.*;

public class FetchDay {
    /**
     * From a list of Transactions, find the Day with the Highest spend
     */
    public static void fetchDay() {
        List<Transactions> transactions = Arrays.asList(
                new Transactions(5000, new Date(2026, 1, 1)),
                new Transactions(500, new Date(2026, 1, 2)),
                new Transactions(50000, new Date(2026, 1, 3)),
                new Transactions(50, new Date(2026, 1, 4)),
                new Transactions(5, new Date(2026, 1, 5))
        );

        System.out.println(transactions);
        Date date = transactions.stream().max(Comparator.comparing(Transactions::getAmount)).map(Transactions::getDay).orElse(null);
        System.out.println(date);
    }

    public static void main(String[] args) {
        fetchDay();
    }
}
