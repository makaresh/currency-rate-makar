package ru.makar.currencyrate.database;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.makar.currencyrate.models.Ruble;

@Repository
public interface RubleRepository extends JpaRepository<Ruble, Integer> {
}
