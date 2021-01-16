package ru.makar.currencyrate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import ru.makar.currencyrate.service.CurrencyService;

@SpringBootTest
class CurrencyRateApplicationTests {

    @Autowired
    private CurrencyService currencyService;

    @Test
    void contextLoads() {
    }

    @Test
    void getPageContent(){
        currencyService.updateCurrency();
    }

}
