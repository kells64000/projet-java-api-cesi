package com.bankonet.spring.services;

import java.util.List;

public class Automate {
	
	public double moyenneDesComptes() {
		
		double solde = 0;
		
		List<IcompteStat> comptes = null;
		
		if (!comptes.isEmpty()) {
			
			for (IcompteStat compte : comptes) {
				solde += compte.getSolde();
			} 
		}
		
		return solde / comptes.size();
	}
}