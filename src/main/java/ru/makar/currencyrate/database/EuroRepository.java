package ru.makar.currencyrate.database;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.makar.currencyrate.models.Euro;

@Repository
public interface EuroRepository extends JpaRepository<Euro, Integer> {
}
