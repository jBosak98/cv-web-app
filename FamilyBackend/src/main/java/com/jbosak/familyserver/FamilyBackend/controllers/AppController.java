package com.jbosak.familyserver.FamilyBackend.controllers;

import com.jbosak.familyserver.FamilyBackend.model.Child;
import com.jbosak.familyserver.FamilyBackend.model.Father;
import com.jbosak.familyserver.FamilyBackend.repositories.ChildRepository;
import com.jbosak.familyserver.FamilyBackend.repositories.FatherRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
//@Controller
public class restController {
    private ChildRepository childRepository;
    private FatherRepository fatherRepository;

    public restController(ChildRepository childRepository, FatherRepository fatherRepository) {
        this.childRepository = childRepository;
        this.fatherRepository = fatherRepository;
    }

    @CrossOrigin
    @RequestMapping(value = "/children", method = RequestMethod.GET)
    public ResponseEntity<List<Child>> getAllChildren(){
        ArrayList<Child> children= new ArrayList<>();
        childRepository.findAll().iterator().forEachRemaining(child -> {
            children.add(child);
        });
        return ResponseEntity.status(HttpStatus.OK).body(children);
    }


        @CrossOrigin
        @RequestMapping(value = "/fathers", method = RequestMethod.GET)
    public ResponseEntity<List<Father>> getAllFathers(){
            ArrayList<Father> fathers = new ArrayList<>();
            fatherRepository.findAll().iterator().forEachRemaining(father -> {
                fathers.add(father);
            });
        return ResponseEntity.status(HttpStatus.OK).body(fathers);
    }

    @CrossOrigin
    @RequestMapping(value = "/father/{id}", method = RequestMethod.GET)
    public ResponseEntity findFatherById(@PathVariable("id") long id){
        Optional<Father> father = fatherRepository.findById(id);
        return ResponseEntity.status(HttpStatus.OK).body(father);
    }

    @CrossOrigin
    @RequestMapping(value = "/children/{id}", method = RequestMethod.GET)
    public ResponseEntity findChildById(@PathVariable("id") long id){
        Optional<Child> child = childRepository.findById(id);
        return ResponseEntity.status(HttpStatus.OK).body(child);
    }

    @CrossOrigin
    @RequestMapping(value = "father/{id}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity updateFatherById(@PathVariable("id") long id, @RequestBody @Valid Father father,Errors errors ){
        if (errors.hasErrors()){
            StringBuilder error = new StringBuilder();
            errors.getAllErrors().forEach(objectError -> {
                error.append(objectError.getDefaultMessage() + "\n");
            });
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(error);
        }else{
                father.setId(id);
                fatherRepository.save(father);
            };
        return ResponseEntity.status(HttpStatus.OK).body("");
    }

    @CrossOrigin
    @RequestMapping(value = "/father/add",method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity addFather(@RequestBody @Valid Father father, Errors errors){
        if (errors.hasErrors()){
            StringBuilder error = new StringBuilder();
            errors.getAllErrors().forEach(objectError -> {
                error.append(objectError.getDefaultMessage() + "\n");
            });
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(error);
        }else{
            fatherRepository.save(father);
            father.getChildren().forEach(child -> {
                        child.setFather(father);
                        childRepository.save(child);
                    });

            return ResponseEntity.status(HttpStatus.CREATED).body("");
        }
    }
}
