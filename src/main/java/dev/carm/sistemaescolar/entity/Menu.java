package dev.carm.sistemaescolar.entity;

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
    private Long id;
    private Long parentId;
    private String name;
    private String path;
    private Boolean active;
}
