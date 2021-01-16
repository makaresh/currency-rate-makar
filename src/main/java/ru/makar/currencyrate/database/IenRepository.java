package ru.makar.currencyrate.database;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.makar.currencyrate.models.Ien;

@Repository
public interface IenRepository extends JpaRepository<Ien, Integer> {
}
