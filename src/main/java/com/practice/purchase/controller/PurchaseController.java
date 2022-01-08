package com.practice.purchase.controller;

import com.practice.purchase.dao.PurchaseDao;
import com.practice.purchase.model.Purchase;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class PurchaseController {

    private final PurchaseDao purchaseDao;

    @GetMapping("/random")
    public Purchase randomAnimal() {
        Purchase purchase = purchaseDao.random();
        System.out.println("Запрос пришёл на этот инстанс Purchase и возвращает объект с id = " + purchase.getId() +
                " и name = " + purchase.getName());
        return purchase;
    }
}