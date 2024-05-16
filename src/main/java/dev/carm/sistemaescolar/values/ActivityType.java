package dev.carm.sistemaescolar.values;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ActivityType {

    CULTURE("Culturales"),
    ACADEMIC("Academicas"),
    EXTRA("Extra curriculares");

    private final String typeName;

}
