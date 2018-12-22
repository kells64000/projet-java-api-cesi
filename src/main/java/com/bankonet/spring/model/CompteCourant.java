package com.bankonet.spring.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "cc")
public class CompteCourant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "decouvert", nullable = false)
	private double montantDecouvertAutorise;
	private static int nbCompteCourant = 0;
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_client", nullable = false)
    @JsonIgnoreProperties("compteCourant")
	private Client client;
	
	public CompteCourant() {
		CompteCourant.nbCompteCourant++;
//		super.nbComptes ++;
	}

    /**
	 * @param id
	 * @param montantDecouvertAutorise
	 */
	public CompteCourant(int id, double montantDecouvertAutorise) {
		this();
		this.id = id;
		this.montantDecouvertAutorise = montantDecouvertAutorise;
	}

    public int getId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

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
	
//	@Override
//	public void debiter(double solde) {
//		if(solde >= montantDecouvertAutorise) {
//			System.out.println("Vous ne pouvez pas débiter car vous avez atteint votre plafond de découvert");
//		}else {
//			this.solde = this.solde + solde;
//		}
//	}
//
//    @Override
//    public double getSolde() {
//        return this.solde;
//    }
}
