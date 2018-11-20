package com.bankonet.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bankonet.spring.model.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer>{}