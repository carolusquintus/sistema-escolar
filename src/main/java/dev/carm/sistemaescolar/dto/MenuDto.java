package dev.carm.sistemaescolar.dto;

import lombok.Value;
import lombok.With;

import java.util.Collection;

@Value
public class MenuDto {
    Long id;
    Long parentId;
    String name;
    String path;
    boolean active;
    @With
    Collection<MenuDto> subMenu;
}
