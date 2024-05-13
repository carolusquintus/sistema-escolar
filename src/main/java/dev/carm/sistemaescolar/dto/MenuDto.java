package dev.carm.sistemaescolar.dto;

public record MenuDto (
    Long id,
    Long parentId,
    String name,
    String path,
    boolean active
) {}
