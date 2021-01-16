package ru.makar.currencyrate.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Component
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "dollar_usa")
public class DollarUSA extends Currency{
    @Id
    @SequenceGenerator(name = "dollar_usa_sequence", sequenceName = "dollar_usa_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "dollar_usa_sequence")
    private Integer id;
}
