package com.bankonet.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//@Entity
//@Table(name = "ce")
//public class CompteEpargne /*extends Compte*/ {

//	private int id;
//	private double tauxInteret;
//	private static int nbCompteEpargne = 0;
//
//	public CompteEpargne() {
//		super();
//		CompteEpargne.nbCompteEpargne++;
//		super.nbComptes ++;
//	}

//	public CompteEpargne(int id, String intitule, double solde, double tauxInteret) {
//		super(id, intitule, solde);
//		this.tauxInteret = tauxInteret;
//	}

//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	public int getId() {
//
//		return id;
//	}
//
//	public void setId(int id) {
//
//		this.id = id;
//	}

//	@Column(name = "taux_interet", nullable = false)
//	public double getTauxInteret() {
//		return tauxInteret;
//	}
//
//	public void setTauxInteret(double tauxInteret) {
//		this.tauxInteret = tauxInteret;
//	}
//
//	public static int getNbCompteEpargne() {
//		return nbCompteEpargne;
//	}
//
//	public static void setNbCompteEpargne(int nbCompteEpargne) {
//		CompteEpargne.nbCompteEpargne = nbCompteEpargne;
//	}

//	@Override
//	public void debiter(double solde) {
//		if(solde <= 0) {
//			System.out.println("Vous ne pouvez pas débiter si la valeur est inférieure ou égale à zéro");
//		}else {
//			this.solde = this.solde + solde;
//		}
//	}
//
//	@Override
//	public double getSolde() {
//		return 0;
//	}
//}