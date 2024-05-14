package dev.carm.sistemaescolar.controller;

import dev.carm.sistemaescolar.service.MenuService;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
public class HomeController {

    private final MenuService service;

    @RequestMapping("/")
    public String viewHomePage(Model model, HttpSession session) {
        var menu = service.listMenu();
        session.setAttribute("menu", menu);

        return "index";
    }
}
