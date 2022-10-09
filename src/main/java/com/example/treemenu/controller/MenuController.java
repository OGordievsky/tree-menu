package com.example.treemenu.controller;

import com.example.treemenu.service.MenuService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MenuController {
    private MenuService service;

    public MenuController(MenuService service) {
        this.service = service;
    }

    @GetMapping
    public String getMenu(Model model) {
        model.addAttribute("rootMenuList", service.getMenuTree());
        return "index";
    }
}