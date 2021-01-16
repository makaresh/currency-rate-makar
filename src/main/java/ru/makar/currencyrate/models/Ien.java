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
@Table(name = "ien")
public class Ien extends Currency{
    @Id
    @SequenceGenerator(name = "ien_sequence", sequenceName = "ien_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ien_sequence")
    private Integer id;
}
