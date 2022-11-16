package fournisseurs;

import java.util.Map;

import Site.Page;

public abstract class Chain {
	
	private Chain nextChain;
	
	public void setNextChain(Chain nextChain) {
		this.nextChain = nextChain;
	}
	
	public Chain getNextChain() {
		return nextChain;
	}
	
	public abstract int computePrice(String name, Map<String, Page> pages);
}
