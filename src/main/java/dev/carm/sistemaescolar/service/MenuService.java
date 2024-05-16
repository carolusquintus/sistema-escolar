package dev.carm.sistemaescolar.service;

import dev.carm.sistemaescolar.dto.MenuDto;
import dev.carm.sistemaescolar.mapper.MenuMapperImpl;
import dev.carm.sistemaescolar.repository.MenuRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class MenuService {

    private final MenuRepository repository;
    private final MenuMapperImpl mapper;

    public List<MenuDto> listMenu() {
        var finalMenus = new ArrayList<MenuDto>();
        var menus = repository.findByParentId(0L);

        for (var menu : menus) {
            var menuDto = mapper.from(menu);
            menuDto = menuDto.withSubMenu(
                repository.findByParentId(menuDto.getId()).stream()
                    .map(mapper::from)
                    .toList());
            finalMenus.add(menuDto);
        }

        return finalMenus;
    }

}
