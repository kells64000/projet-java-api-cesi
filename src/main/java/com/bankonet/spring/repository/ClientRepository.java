package com.bankonet.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bankonet.spring.model.Client;


@Repository
public interface ClientRepository extends CrudRepository<Client, Integer> {}