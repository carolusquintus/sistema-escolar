package dev.carm.sistemaescolar.dto;

import dev.carm.sistemaescolar.values.ActivityType;

import java.time.LocalDateTime;

public record ActivityDto (
    Long id,
    ActivityType type,
    String name,
    LocalDateTime initDateTime,
    LocalDateTime endDateTime
) {}
