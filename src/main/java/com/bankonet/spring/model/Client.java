package com.bankonet.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "client")
public class Client {

    private int id;
    private String nom;
    private String prenom;

    public Client() {

    }

    public Client(String nom, String prenom) {

        this.nom = nom;
        this.prenom = prenom;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    @Column(name = "nom", nullable = false)
    public String getNom() {

        return nom;
    }

    public void setNom(String nom) {

        this.nom = nom;
    }

    @Column(name = "prenom", nullable = false)
    public String getPrenom() {

        return prenom;
    }

    public void setPrenom(String prenom) {

        this.prenom = prenom;
    }

    @Override
    public String toString() {

        return "Client [id=" + id + ", Prénom=" + prenom + ", Nom=" + nom + "]";
    }
}
