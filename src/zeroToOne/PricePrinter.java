package zeroToOne;

import java.util.List;
import java.util.ArrayList;

public class PricePrinter {
    public static void main(String[] args) {
        List<Integer> prices = new ArrayList<Integer>();

        prices.add(1980);
        prices.add(2980);
        prices.add(19800);
        prices.add(4980);

        for (int price : prices) {
            System.out.printf("%d円%n", price);
        }
    }

}
