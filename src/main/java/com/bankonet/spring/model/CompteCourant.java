package com.bankonet.spring.model;

public class CompteCourant extends Compte {
	
	private double montantDecouvertAutorise;
	private static int nbCompteCourant = 0;
	
	public CompteCourant() {
		CompteCourant.nbCompteCourant++;
		super.nbComptes ++;
	}
	
	/**
	 * @param numero
	 * @param intitule
	 * @param solde
	 * @param montantDecouvertAutorise
	 */
	public CompteCourant(String numero, String intitule, double solde, double montantDecouvertAutorise) {
		this();
		this.numero = numero;
		this.intitule = intitule;
		this.solde = solde;
		this.montantDecouvertAutorise = montantDecouvertAutorise;
	}
	
	public double getMontantDecouvertAutorise() {
		return montantDecouvertAutorise;
	}
	
	public static int getNbCompteCourant() {
		return nbCompteCourant;
	}
	
	public String getNumeroCompteCourant() {
		return numero;
	}
	
	public void setMontantDecouvertAutorise(double montantDecouvertAutorise) {
		this.montantDecouvertAutorise = montantDecouvertAutorise;
	}
	
	@Override
	public void debiter(double solde) {
		if(solde >= montantDecouvertAutorise) {
			System.out.println("Vous ne pouvez pas d�biter car vous avez atteint votre plafond de d�couvert");
		}else {
			this.solde = this.solde + solde;
		}
	}
}
