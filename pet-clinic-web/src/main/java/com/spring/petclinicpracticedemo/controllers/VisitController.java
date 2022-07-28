package com.spring.petclinicpracticedemo.controllers;

import com.spring.petclinicpracticedemo.services.PetService;
import com.spring.petclinicpracticedemo.services.VisitService;
import org.springframework.stereotype.Controller;


@Controller
public class VisitController {

    private final VisitService visitService;
    private final PetService petService;

    public VisitController(VisitService visitService, PetService petService) {
        this.visitService = visitService;
        this.petService = petService;
    }
}
