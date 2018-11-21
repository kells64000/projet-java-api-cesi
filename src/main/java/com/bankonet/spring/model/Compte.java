package com.bankonet;

public abstract class Compte implements IcompteStat {

	protected String numero;
	protected String intitule;
	protected double solde;
	protected static int nbComptes = 0;
	
	public String getNumero() {
		return numero;
	}
	
	public String getIntitule() {
		return intitule;
	}
	
	public double getSolde() {
		return solde;
	}
	
	public static int getNbComptes() {
		return nbComptes;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}
	
	public static int NbCompte() {
		return nbComptes;
	}
	
	public final void crediter(double solde) {
		if(solde <= 0) {
			System.out.println("Vous ne pouvez pas créditer si la valeur est infèrieure ou égale à zéro");
		}else {
			this.solde = this.solde + solde;		
		}
	}
	
	abstract public void debiter(double solde);
	
	public String toString() {
		return "Le solde du compte est de : " + this.solde;
	}
	
}
