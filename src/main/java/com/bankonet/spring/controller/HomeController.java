package com.bankonet.spring.controller;

import com.bankonet.spring.model.Client;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

public class HomeController
{
    public List<Client> getAllClients() {

        return (List<Client>) clientRepository.findAll();
    }
}
