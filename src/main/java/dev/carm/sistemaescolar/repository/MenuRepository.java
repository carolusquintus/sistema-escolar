package dev.carm.sistemaescolar.repository;

import dev.carm.sistemaescolar.entities.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuRepository extends JpaRepository<Menu, Long> {
}
