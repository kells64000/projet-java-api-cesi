package com.bankonet.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bankonet.spring.model.CompteCourant;

@Repository
public interface CompteCourantRepository extends CrudRepository<CompteCourant, Integer> {}