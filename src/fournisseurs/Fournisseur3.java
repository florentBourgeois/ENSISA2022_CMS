package fournisseurs;

import java.util.Map;

import Site.Page;

public class Fournisseur3 extends Chain {
	private String name = "F3";

	public int computePrice(String name, Map<String, Page> pages) {
		/**
		 * NOTA : normalement le prix ne devrait pas déprendre du nombre de page mais des éléments prensents sur la page
		 */
		if(name.equals(this.name))
			return 3*pages.size();
		else if (this.getNextChain() != null)
			return this.getNextChain().computePrice(name, pages);
		return -1;
	}
}
