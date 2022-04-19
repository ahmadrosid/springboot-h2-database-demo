package com.example.demo.controller;

import com.example.demo.model.Money;
import com.example.demo.service.MoneyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MoneyController {

    @Autowired
    private final MoneyService moneyService;

    public MoneyController(MoneyService moneyService) {
        this.moneyService = moneyService;
    }

    @GetMapping("/")
    public List<Money> index() {
        return moneyService.getAllMoneys();
    }
}
