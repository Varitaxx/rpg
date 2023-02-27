package de.varitaxx.rpg.repository;

import de.varitaxx.rpg.model.Charakter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CharakterRepository extends JpaRepository<Charakter,Long> {
}
