package fournisseurs;

import java.util.HashMap;
import java.util.Map;

import Site.Page;

public class Fournisseur {
	
	public static void main(String[] args) {
		Chain fournisseur1 = new Fournisseur1();
		Chain fournisseur2 = new Fournisseur2();
		Chain fournisseur3 = new Fournisseur3();
		
		fournisseur1.setNextChain(fournisseur2);
		fournisseur2.setNextChain(fournisseur3);
				
		Map<String, Page> pagesList1 = new HashMap<>();
		pagesList1.put("Page 1", new Page("Page1", ""));
		pagesList1.put("Page 2", new Page("Page2", ""));
		System.out.println("Prix fournisseur 1 pour le site 1 (2 pages) : " + fournisseur1.computePrice("F1", pagesList1));
		System.out.println("Prix fournisseur 2 pour le site 1 : " + fournisseur1.computePrice("F2", pagesList1));
		System.out.println("Prix fournisseur 3 pour le site 1 : " + fournisseur1.computePrice("F3", pagesList1));
		
		Map<String, Page> pagesList2 = new HashMap<>();
		pagesList2.put("Page 1", new Page("Page1",""));
		pagesList2.put("Page 2", new Page("Page2",""));
		pagesList2.put("Page 3", new Page("Page3",""));
		System.out.println("Prix fournisseur 1 pour le site 2 (3 pages) : " + fournisseur1.computePrice("F1", pagesList2));
		System.out.println("Prix fournisseur 2 pour le site 2 : " + fournisseur1.computePrice("F2", pagesList2));
		System.out.println("Prix fournisseur 3 pour le site 2 : " + fournisseur1.computePrice("F3", pagesList2));
	}
}
