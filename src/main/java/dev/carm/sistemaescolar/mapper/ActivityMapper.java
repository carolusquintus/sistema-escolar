package dev.carm.sistemaescolar.mapper;

import dev.carm.sistemaescolar.dto.ActivityDto;
import dev.carm.sistemaescolar.entity.Activity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ActivityMapper {

    ActivityDto from(Activity source);
    Activity to(ActivityDto destination);

}
