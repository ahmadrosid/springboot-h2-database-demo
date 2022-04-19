package com.example.demo.service;

import com.example.demo.model.Money;
import com.example.demo.repository.MoneyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MoneyService {
    @Autowired
    private MoneyRepository moneyRepository;

    public Optional<Money> getById(Long id) {
        return moneyRepository.findById(id);
    }

    public List<Money> getAllMoneys() {
        return moneyRepository.findAll();
    }
}
