package ru.makar.currencyrate.database;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.makar.currencyrate.models.DollarUSA;

@Repository
public interface DollarUSARepository extends JpaRepository<DollarUSA, Integer> {
}
