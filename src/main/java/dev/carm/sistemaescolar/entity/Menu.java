package dev.carm.sistemaescolar.entity;

import jakarta.persistence.*;
import lombok.Data;

import static jakarta.persistence.GenerationType.SEQUENCE;

@Data
@Entity
public class Menu {

    @Id
    @GeneratedValue(strategy = SEQUENCE)
    private Long id;

    private Long parentId;

    private String name;

    private String path;

    private Boolean active;


}
