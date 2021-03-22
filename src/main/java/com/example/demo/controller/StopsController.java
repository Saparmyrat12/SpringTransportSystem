package com.example.demo.controller;

import com.example.demo.servise.StopsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class StopsController {

    @Autowired
    private StopsService stopsService;

    @GetMapping("/stops")
    public String index(Model model) {
        //добавляем список всех drivers в модел
        model.addAttribute("stops", stopsService.getAll());
        //возвр people/index странису хтмл
        return "stops/index";
    }

    @GetMapping("/stops/{id}")
    //значение из юрл мы присваиваем в id
    public String show(@PathVariable("id") Long id, Model model) {
        //показывем конкретное человека по ид
        model.addAttribute("stops", stopsService.getById(id));
        return "stops/show";
    }
}

