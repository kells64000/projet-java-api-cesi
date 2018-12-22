package com.bankonet.spring.controller;

import java.util.List;

import com.bankonet.spring.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.bankonet.spring.repository.CompteCourantRepository;
import com.bankonet.spring.model.CompteCourant;

import javax.validation.Valid;

@RestController
@RequestMapping("/api")
public class CompteCourantController {

    @Autowired
    private CompteCourantRepository compteCourantRepository;

    @GetMapping("/comptes/cc")
    public List<CompteCourant> getAllComptes() {

        return (List<CompteCourant>) compteCourantRepository.findAll();
    }

    @GetMapping("/comptes/cc/{id}")
    public ResponseEntity<CompteCourant> getCompteCourantById(@PathVariable(value = "id") Integer compteCourantId)

            throws ResourceNotFoundException {

        CompteCourant cc = compteCourantRepository.findById(compteCourantId)

                .orElseThrow(() -> new ResourceNotFoundException("Compte courant not found for this id :: " + compteCourantId));

        return ResponseEntity.ok().body(cc);
    }

    @PostMapping("/comptes/cc")
    public CompteCourant createCompteCourant(@Valid @RequestBody CompteCourant cc) {

        return compteCourantRepository.save(cc);
    }
}