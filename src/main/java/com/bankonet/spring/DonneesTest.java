package com.bankonet.spring;

import java.util.List;
import java.util.ArrayList;

public class DonneesTest {
	
	public List<IcompteStat> construitEchantillonComptes() {
		
		List<IcompteStat> list = new ArrayList<IcompteStat>();
		
		list.add(new CompteCourant("01", "CC01", 100, 300)); 
		list.add(new CompteCourant("02", "CC02", 10, 30)); 
		list.add(new CompteCourant("03", "CC03", 50, 150)); 
		list.add(new CompteCourant("04", "CC04", 1000, 3000)); 
		list.add(new CompteCourant("05", "CC05", 300, 100)); 
		
		list.add(new CompteEpargne("01", "CE01", 100, 1.5)); 
		list.add(new CompteEpargne("02", "CE02", 500, 1.5)); 
		list.add(new CompteEpargne("03", "CE03", 200, 1.5)); 
		list.add(new CompteEpargne("04", "CE04", 300, 1.5)); 
		list.add(new CompteEpargne("05", "CE05", 400, 1.5)); 

		return list;
	}
}
