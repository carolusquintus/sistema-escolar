package dev.carm.sistemaescolar.repository;

import dev.carm.sistemaescolar.entity.Activity;
import dev.carm.sistemaescolar.value.ActivityType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ActivityRepository extends JpaRepository<Activity, Long> {

    List<Activity> findByType(ActivityType type);

}
