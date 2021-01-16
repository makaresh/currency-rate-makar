package ru.makar.currencyrate.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("currency")
public class CurrencyController {

    @GetMapping("/all")
    public List<Map<String, String>> getAll() {

        return null;
    }

    @GetMapping("/allTest")
    public String getAllTest() {

        return "Курсы валют";
    }
}
