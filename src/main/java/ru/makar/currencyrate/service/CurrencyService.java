package ru.makar.currencyrate.service;

import lombok.RequiredArgsConstructor;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;
import ru.makar.currencyrate.database.CodesRepository;
import ru.makar.currencyrate.models.Codes;
import ru.makar.currencyrate.models.Currency;
import ru.makar.currencyrate.models.DollarUSA;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class CurrencyService {
    private final Map<String, Currency> currencyMap;
    private final CodesRepository codesRepository;

    public void updateCurrency() {
        Document document;
        try {
            document = Jsoup.connect("https://www.cbr.ru/currency_base/daily/").get();
            Elements date = document.getElementsByClass("page-info_last-update");
            Elements tables = document.getElementsByTag("tbody");
            Element table = tables.get(0);
            Elements tableElements = table.children();
            Currency currency;
            List<Codes> codesList = codesRepository.findAll();
            for (Element el : tableElements) {
                Elements rowElements = el.children();
                for(Codes code : codesList) {
                    if (rowElements.get(0).text().equals(code.getCode())) {
                        currency = currencyMap.get("dollarUSA");
                        currency.setCodeId(rowElements.get(0).text());
                        currency.setLatterCode(rowElements.get(1).text());
                        currency.setName(rowElements.get(3).text());
                        currency.setValue(Double.parseDouble(rowElements.get(4).text().replace(",", ".")));
                        //currency.setUpdateDate(LocalDate.parse(date.text()));
                    }
                    System.out.println();
                }
            }
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
