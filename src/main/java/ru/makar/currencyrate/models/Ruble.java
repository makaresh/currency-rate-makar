package ru.makar.currencyrate.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Component
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "ruble")
public class Ruble extends Currency{
    @Id
    @SequenceGenerator(name = "ruble_sequence", sequenceName = "ruble_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ruble_sequence")
    private Integer id;
}
