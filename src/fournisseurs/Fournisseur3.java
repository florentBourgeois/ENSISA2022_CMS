package fournisseurs;

import java.util.Map;

import Site.Page;

public class Fournisseur3 extends Chain {
	private String name = "F3";

	public int computePrice(String name, Map<String, Page> pages) {
		return 3*pages.size();
	}
}
