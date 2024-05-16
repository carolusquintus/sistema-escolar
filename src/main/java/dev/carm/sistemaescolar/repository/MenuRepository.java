package dev.carm.sistemaescolar.repository;

import dev.carm.sistemaescolar.entity.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MenuRepository extends JpaRepository<Menu, Long> {

    List<Menu> findByParentId(Long parentId);
}
