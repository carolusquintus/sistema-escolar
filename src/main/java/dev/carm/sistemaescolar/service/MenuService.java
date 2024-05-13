package dev.carm.sistemaescolar.service;

import dev.carm.sistemaescolar.dto.MenuDto;
import dev.carm.sistemaescolar.mapper.MenuMapperImpl;
import dev.carm.sistemaescolar.repository.MenuRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MenuService {

    private final MenuRepository repository;
    private final MenuMapperImpl mapper;

    public List<MenuDto> listMenu() {
        return repository.findAll().stream()
            .map(mapper::from)
            .toList();
    }

}
