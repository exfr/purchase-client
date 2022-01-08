package com.practice.purchase.dao;

import com.practice.purchase.model.Purchase;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Component
public class PurchaseDao {

    private final List<Purchase> list = Arrays.asList(new Purchase(1, "Potato"),
                                                new Purchase(2, "Carrot"),
                                                new Purchase(3, "Cucumber"),
                                                new Purchase(4, "Banana"),
                                                new Purchase(5, "Cocosa"));
    public Purchase random() {
        Random rand = new Random();
        return list.get(rand.nextInt(list.size()));
    }
}
