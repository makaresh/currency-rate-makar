package ru.makar.currencyrate.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "table_name")
public class Codes {
    @Id
    @SequenceGenerator(name = "table_name_sequence", sequenceName = "table_name_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "table_name_sequence")
    private Integer codeId;
    private String code;
}
