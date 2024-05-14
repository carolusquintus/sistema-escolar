package dev.carm.sistemaescolar.repository;

import dev.carm.sistemaescolar.entity.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuRepository extends JpaRepository<Menu, Long> {
}
