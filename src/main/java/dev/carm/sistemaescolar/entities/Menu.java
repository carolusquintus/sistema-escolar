package dev.carm.sistemaescolar.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

import static jakarta.persistence.GenerationType.IDENTITY;

@Data
@Entity
public class Menu {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    Long id;
    Long parentId;
    String name;
    String path;
    Boolean active;
}
