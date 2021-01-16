package ru.makar.currencyrate.database;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.makar.currencyrate.models.Codes;

@Repository
public interface CodesRepository extends JpaRepository<Codes, Integer> {
}
