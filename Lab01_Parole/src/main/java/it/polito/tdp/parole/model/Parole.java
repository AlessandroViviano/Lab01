package it.polito.tdp.parole.model;

import java.util.List;
import java.util.*;

public class Parole {
	LinkedList<String> parole;
		
	public Parole() {
		parole = new LinkedList<String>();
	}
	
	public void addParola(String p) {
		parole.add(p);
	}
	
	public List<String> getElenco() {
		
		LinkedList<String> paroleOrdinate = new LinkedList<String>(parole);
		Collections.sort(paroleOrdinate);
		return paroleOrdinate;
	}
	
	public void reset() {
		parole.clear();
	}
	
	public void cancella(String p) {
		parole.remove(p);
	}
}
