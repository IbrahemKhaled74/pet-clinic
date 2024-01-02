package com.petclinic.controllers;

import com.petclinic.services.OwnerService;
import com.petclinic.services.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({})
public class VetController {
    private final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @RequestMapping({"/vets","vets/index","vets/index.html"})
    String getAllOwners(Model model){
        model.addAttribute("vets",vetService.findAll());
        return "vets/index";
    }
}
