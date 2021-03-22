package com.example.demo.controller;

import com.example.demo.servise.RoutesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class RoutesController {
    @Autowired
    private RoutesService routesService;

    @GetMapping("/routes")
    public String index(Model model) {
        //добавляем список всех drivers в модел
        model.addAttribute("routes", routesService.getAll());
        //возвр people/index странису хтмл
        return "routes/index";
    }

    @GetMapping("/routes/{id}")
    //значение из юрл мы присваиваем в id
    public String show(@PathVariable("id") Long id, Model model) {
        //показывем конкретное человека по ид
        model.addAttribute("routes", routesService.getById(id));
        return "routes/show";
    }
}
