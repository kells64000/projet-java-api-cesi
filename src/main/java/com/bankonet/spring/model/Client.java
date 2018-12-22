package com.bankonet.spring.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;

@Entity
@Table(name = "client")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "nom", nullable = false)
    private String nom;
    @Column(name = "prenom", nullable = false)
    private String prenom;
    //@JsonManagedReference;
    @OneToOne(fetch = FetchType.LAZY,
            cascade = CascadeType.ALL,
            mappedBy="client")
    private CompteCourant cc;

    public Client() {

    }

    public Client(String nom, String prenom) {

        this.nom = nom;
        this.prenom = prenom;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public String getNom() {

        return nom;
    }

    public void setNom(String nom) {

        this.nom = nom;
    }

    public String getPrenom() {

        return prenom;
    }

    public void setPrenom(String prenom) {

        this.prenom = prenom;
    }

    public CompteCourant getCc() {
        return cc;
    }

    public void setCc(CompteCourant cc) {
        this.cc = cc;
    }

    @Override
    public String toString() {

        return "Client [id=" + id + ", Prénom=" + prenom + ", Nom=" + nom + "]";
    }
}
