package com.spring.petclinicpracticedemo.controllers;

import com.spring.petclinicpracticedemo.services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/owners")
@Controller
public class OwnerController {
    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping("/find")
    public String findOwners(Model model){
        return "notimplemented";
    }

    @RequestMapping({"", "/", "/index", "/index.html"})
    public String listOwners(Model model){
        model.addAttribute("owners", ownerService.findAll());
        return "owners/index";
    }

}