package exercise1.app;

import exercise1.model.Item;

import java.math.BigDecimal;
import java.util.List;

public class PriceCalculator {

    public static BigDecimal sumNettoPrice(List<Item> items){
        BigDecimal sum = BigDecimal.ZERO;
        for(Item item : items){
            sum = sum.add(item.getNettoPrice());
        }
        return sum;
    }

    public static BigDecimal sumTaxPrice(List<Item> items){
        BigDecimal sum = BigDecimal.ZERO;
        for(Item item : items){
            sum = sum.add(item.getTax());
        }
        return sum;
    }

    public static BigDecimal sumBruttoPrice(List<Item> items){
        BigDecimal sum = BigDecimal.ZERO;
        for(Item item : items){
            sum = sum.add(item.getBruttoPrice());
        }
        return sum;
    }
}
