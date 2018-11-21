package com.bankonet.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bankonet.spring.model.CompteEpargne;

@Repository
public interface CompteEpargneRepository extends CrudRepository<CompteEpargne, Integer> {}