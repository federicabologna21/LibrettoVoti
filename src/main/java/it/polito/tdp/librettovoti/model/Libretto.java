package it.polito.tdp.librettovoti.model;

import java.util.ArrayList;
import java.util.List;

public class Libretto {

	private List<Voto> voti; // in cui memorizzo i voti
	// al momento la variabile voti è null 
	
	
	public Libretto() {
		this.voti = new ArrayList<>();
		// quando faccio new inizializzo la variabile
	}
	
	public void add(Voto v) {
		this.voti.add(v);
	}
	
	public String toString() {
		String s = "";
		for (Voto v: this.voti) {
			s = s + v.toString() + "\n" ;
		}
		return s;
	}
}
