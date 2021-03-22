package com.example.demo.controller;

import com.example.demo.entity.Drivers;
import com.example.demo.entity.Routes;
import com.example.demo.servise.DriverService;
import com.example.demo.servise.RoutesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
public class DriverController {

    @Autowired
    private DriverService driverService;

    @GetMapping("/drivers")
    public String index(Model model) {
        //добавляем список всех drivers в модел
        model.addAttribute("driver", driverService.getAll());
        //возвр people/index странису хтмл
        return "drivers/index";
    }

    @GetMapping("/drivers/{id}")
    //значение из юрл мы присваиваем в id
    public String show(@PathVariable("id") Long id, Model model) {
        //показывем конкретное человека по ид
        model.addAttribute("driver", driverService.getById(id));
        return "drivers/show";
    }
}

