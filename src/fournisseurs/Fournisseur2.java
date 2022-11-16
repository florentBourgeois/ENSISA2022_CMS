package fournisseurs;

import java.util.Map;

import Site.Page;

public class Fournisseur2 extends Chain {
	private String name = "F2";

	public int computePrice(String name, Map<String, Page> pages) {
		if(name != this.name)
			return this.getNextChain().computePrice(name, pages);
		else
			return 2*pages.size();
	}
}
