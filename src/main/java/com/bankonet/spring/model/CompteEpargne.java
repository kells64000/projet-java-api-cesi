package com.bankonet;

public class CompteEpargne extends Compte {
	
	private double tauxInteret;
	private static int nbCompteEpargne = 0;
	
	public CompteEpargne() {
		CompteEpargne.nbCompteEpargne++;
		super.nbComptes ++;		
	}
	
	/**
	 * @param numero
	 * @param intitule
	 * @param solde
	 * @param montantDecouvertAutorise
	 */
	public CompteEpargne(String numero, String intitule, double solde, double tauxInteret) {
		this();
		this.numero = numero;
		this.intitule = intitule;
		this.solde = solde;
		this.tauxInteret = tauxInteret;
	}
	
	public double getTauxInteret() {
		return tauxInteret;
	}
	
	public static int getNbCompteEpargne() {
		return nbCompteEpargne;
	}
	
	public String getNumeroCompteEpargne() {
		return numero;
	}
	
	public void setTauxInteret(double tauxInteret) {
		this.tauxInteret = tauxInteret;
	}
	
	@Override
	public void debiter(double solde) {
		if(solde >= 0) {
			System.out.println("Vous ne pouvez pas débiter si la valeur est supérieure ou égale à zéro");
		}else {
			this.solde = this.solde + solde;
		}
	}
	
}