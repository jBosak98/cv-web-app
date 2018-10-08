package com.jbosak.familyserver.FamilyBackend.controllers;

import com.jbosak.familyserver.FamilyBackend.model.Father;
import com.jbosak.familyserver.FamilyBackend.repositories.FatherRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Optional;

//@RestController
@Controller
public class FatherController {
    private FatherRepository fatherRepository;

    public FatherController(FatherRepository fatherRepository) {
        this.fatherRepository = fatherRepository;
    }

    @RequestMapping(value = "/father")
    public String getFathers(Model model){
        model.addAttribute("fathers", fatherRepository.findAll());
        return  "fathers";
    }
    @RequestMapping(value = "/father/{id}", method = RequestMethod.GET)
    public ResponseEntity findFatherById(@PathVariable("id") long id){
        Optional<Father> father = fatherRepository.findById(id);
        return ResponseEntity.status(HttpStatus.OK).body(father);
    }
}
