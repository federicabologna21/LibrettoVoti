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
	
	// Richiesta 2
	
	/*
	public void stampaVotiUguali (int punteggio) {
		// il libretto stampa da solo i voti
		System.out.println(); // fa solo questo l'altro metodo è più versatile
	}
	
	//oppure 
	// metodo più generale
	public String votiUguali (int punteggio) {
		// calcola una stringa che contiene i voti 
		// sarà poi il chiamante a stamparli
		// -> Solo il NOME?
		// -> Tutto il voto .toString()
		// perche il punto 2 è ambiguo 
		
	}
	*/
	
	public List<Voto> listaVotiUguali(int punteggio){
		// restituisce solo i voti uguali al criterio 
		List<Voto> risultato = new ArrayList<>();
		for (Voto v: this.voti) {
			if (v.getVoto()== punteggio) {
				risultato.add(v);
			}
		}
		return risultato;
	}

	public Libretto votiUguali (int punteggio) {
		Libretto risultato = new Libretto();
		for (Voto v: this.voti) {
			if (v.getVoto() == punteggio) {
				risultato.add(v);
				// risultato.voti.add(v); giusto ma superfluo 
				}
		}
		return risultato;
	} 
	
}
