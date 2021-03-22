package com.example.demo.controller;

import com.example.demo.servise.DriverService;
import com.example.demo.servise.TransportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class TransportsControlles {

    @Autowired
    private TransportService transportService;

    @GetMapping("/transports")
    public String index(Model model) {
        //добавляем список всех drivers в модел
        model.addAttribute("transports", transportService.getAll());
        //возвр people/index странису хтмл
        return "transports/index";
    }

    @GetMapping("/transports/{id}")
    //значение из юрл мы присваиваем в id
    public String show(@PathVariable("id") Long id, Model model) {
        //показывем конкретное человека по ид
        model.addAttribute("transports", transportService.getById(id));
        return "transports/show";
    }
}
