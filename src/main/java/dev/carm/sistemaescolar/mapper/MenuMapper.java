package dev.carm.sistemaescolar.mapper;

import dev.carm.sistemaescolar.dto.MenuDto;
import dev.carm.sistemaescolar.entity.Menu;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MenuMapper {

    MenuDto from(Menu source);
    Menu to(MenuDto destination);

}
