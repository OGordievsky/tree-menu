package com.example.treemenu.controller

import com.example.treemenu.service.MenuService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class MenuController(private val service: MenuService) {
    @GetMapping
    fun getMenu(model: Model): String {
        model.addAttribute("rootMenuList", service.menuTree)
        return "index"
    }
}