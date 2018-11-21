package com.bankonet.spring;

import java.util.List;

public class Automate {
	
	public double moyenneDesComptes() {
		
		double solde = 0;
		
		List<IcompteStat> comptes = new DonneesTest().construitEchantillonComptes();
		
		if (!comptes.isEmpty()) {
			
			for (IcompteStat compte : comptes) {
				solde += compte.getSolde();
			} 
		}
		
		return solde / comptes.size();
	}
}