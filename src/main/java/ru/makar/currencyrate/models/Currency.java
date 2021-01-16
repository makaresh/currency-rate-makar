package ru.makar.currencyrate.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Getter
@Setter
@Component
@NoArgsConstructor
@AllArgsConstructor
public abstract class Currency {
    private String codeId;
    private String latterCode;
    private String name;
    private Double value;
    private LocalDate updateDate;
}
