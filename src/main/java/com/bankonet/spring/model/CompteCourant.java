package com.bankonet.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cc")
public class CompteCourant extends Compte {

    private int id;
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

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    @Column(name = "decouvert", nullable = false)
	public double getMontantDecouvertAutorise() {
		return montantDecouvertAutorise;
	}

    public void setMontantDecouvertAutorise(double montantDecouvertAutorise) {
        this.montantDecouvertAutorise = montantDecouvertAutorise;
    }
	
	public static int getNbCompteCourant() {
		return nbCompteCourant;
	}

    public static void setNbCompteCourant(int nbCompteCourant) {
        CompteCourant.nbCompteCourant = nbCompteCourant;
    }
	
//	public String getNumeroCompteCourant() {
//		return numero;
//	}
//
//    public void setNumeroCompteCourant(String numeroCompteCourant) {
//        this.numero = numeroCompteCourant;
//    }
	
	@Override
	public void debiter(double solde) {
		if(solde >= montantDecouvertAutorise) {
			System.out.println("Vous ne pouvez pas débiter car vous avez atteint votre plafond de découvert");
		}else {
			this.solde = this.solde + solde;
		}
	}
}
