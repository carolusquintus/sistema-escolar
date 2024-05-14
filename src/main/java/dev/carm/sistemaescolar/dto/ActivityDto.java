package dev.carm.sistemaescolar.dto;

import dev.carm.sistemaescolar.value.ActivityType;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDateTime;

import static jakarta.persistence.EnumType.STRING;
import static jakarta.persistence.GenerationType.IDENTITY;

public record ActivityDto (
    Long id,
    ActivityType type,
    String name,
    LocalDateTime initDateTime,
    LocalDateTime endDateTime
) {}
