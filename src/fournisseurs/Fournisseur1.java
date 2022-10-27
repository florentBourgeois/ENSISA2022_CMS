package fournisseurs;

import java.util.Map;

import Site.Page;

public class Fournisseur1 extends Chain {
	private String name = "F1";

	public int computePrice(String name, Map<String, Page> pages) {
		if(name != this.name)
			return this.getNextChain().computePrice(name, pages);
		else
			return pages.size();
	}
}
