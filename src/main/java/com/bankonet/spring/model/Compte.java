package com.bankonet.spring.model;

//import javax.persistence.*;

//import com.bankonet.spring.services.IcompteStat;

//@Entity
//@Table(name = "compte")
//public abstract class Compte implements IcompteStat {

//	protected int id;
//	@Column(name = "intitule", nullable = false)
//	protected String intitule;
//	@Column(name = "solde", nullable = false)
//	protected double solde;
//	protected Integer client_id;
//	static int nbComptes = 0;
//
//	public Compte() {
//
//	}
//
//	public Compte(int id, String intitule, double solde) {
//		this.id = id;
//		this.intitule = intitule;
//		this.solde = solde;
//	}
//
//	public int getId() {
//		return id;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}
//
//	public String getIntitule() {
//		return intitule;
//	}
//
//	public void setIntitule(String intitule) {
//		this.intitule = intitule;
//	}
//
//	public double getSolde(Compte id) {
//		return this.solde;
//	}
//
//	public double setSolde(Compte id, double solde) {
//		this.solde = solde;
//
//		return this.solde;
//	}
//
//	public static int getNbComptes() {
//		return nbComptes;
//	}
//
//	public static int NbCompte() {
//		return nbComptes;
//	}
//
//	public final void crediter(double solde) {
//
//			this.solde = this.solde + solde;
//	}
//
//	abstract public void debiter(double solde);
//
//	public String toString() {
//		return "Le solde du compte est de : " + this.solde;
//	}
//
//}
