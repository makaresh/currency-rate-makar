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
@Table(name = "euro")
public class Euro extends Currency{
    @Id
    @SequenceGenerator(name = "euro_sequence", sequenceName = "euro_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "euro_sequence")
    private Integer id;
}
