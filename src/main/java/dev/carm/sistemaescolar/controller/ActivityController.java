package dev.carm.sistemaescolar.controller;

import dev.carm.sistemaescolar.service.ActivityService;
import dev.carm.sistemaescolar.value.ActivityType;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/activities")
@RequiredArgsConstructor
public class ActivityController {

    private final ActivityService service;

    @RequestMapping
    public String viewHomePage() {
        var activities = service.findByType(ActivityType.ACADEMIC);
        return "index";
    }
}
