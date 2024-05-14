package dev.carm.sistemaescolar.service;

import dev.carm.sistemaescolar.dto.ActivityDto;
import dev.carm.sistemaescolar.entity.Activity;
import dev.carm.sistemaescolar.mapper.ActivityMapper;
import dev.carm.sistemaescolar.value.ActivityType;
import dev.carm.sistemaescolar.repository.ActivityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ActivityService {

    private final ActivityRepository repository;
    private final ActivityMapper mapper;

    public List<ActivityDto> findByType(ActivityType type) {
        return repository.findByType(type).stream()
            .map(mapper::from)
            .toList();
    }
}
