package com.bankonet.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bankonet.spring.repository.CompteCourantRepository;
import com.bankonet.spring.model.CompteCourant;

@RestController
@RequestMapping("/api")
public class CompteCourantController {

    @Autowired
    private CompteCourantRepository compteCourantRepository;

    @GetMapping("/comptes/cc")
    public List<CompteCourant> getAllComptes() {

        return (List<CompteCourant>) compteCourantRepository.findAll();
    }
}