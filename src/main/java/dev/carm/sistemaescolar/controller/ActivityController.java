package dev.carm.sistemaescolar.controller;

import dev.carm.sistemaescolar.service.ActivityService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import dev.carm.sistemaescolar.values.ActivityType;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import static org.thymeleaf.util.StringUtils.capitalize;

@Controller
@RequestMapping("/activities")
@RequiredArgsConstructor
public class ActivityController {

    private final ActivityService service;

    @RequestMapping
    public String activity(@RequestParam ActivityType type, Model model) {
        var activities = service.findByType(type);

        model.addAttribute("activityType", capitalize(type.getTypeName()));
        model.addAttribute("activities", activities);

        return "activities";
    }

}
