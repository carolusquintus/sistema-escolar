package dev.carm.sistemaescolar.entity;

import dev.carm.sistemaescolar.values.ActivityType;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

import static jakarta.persistence.EnumType.STRING;
import static jakarta.persistence.GenerationType.IDENTITY;

@Data
@Entity
public class Activity {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @Enumerated(STRING)
    private ActivityType type;

    private String name;

    private LocalDateTime initDateTime;

    private LocalDateTime endDateTime;

}
