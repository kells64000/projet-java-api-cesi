package com.bankonet.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bankonet.spring.repository.CompteEpargneRepository;
import com.bankonet.spring.model.CompteEpargne;

@RestController
@RequestMapping("/api")
public class CompteEpargneController {

    @Autowired
    private CompteEpargneRepository compteEpargneRepository;

    @GetMapping("/comptes/ce")
    public List<CompteEpargne> getAllComptes() {

        return (List<CompteEpargne>) compteEpargneRepository.findAll();
    }
}