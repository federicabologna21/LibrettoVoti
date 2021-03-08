package it.polito.tdp.librettovoti.model;

import java.time.LocalDate;
import java.util.List;

public class TestLibretto {


	public static void main (String[] args) {
	
	// deve creare 10 voti e aggiungerli al libretto (richiesta 1)
	
		System.out.println("Test metodi Libretto");
		Libretto libretto = new Libretto();
		
		Voto voto1 = new Voto ("Analisi 1", 30, LocalDate.of(2019,  2, 15));
		libretto.add(voto1);
		libretto.add(new Voto("Fisica 1", 28, LocalDate.of(2019, 7, 15)));
		libretto.add(new Voto("Informatica", 24, LocalDate.of(2019, 9, 15)));
		libretto.add(new Voto("Chimica", 25, LocalDate.of(2019, 9, 15)));
		// ne mettiamo 3 ma sarebbero 10
		
		System.out.println(libretto);  // cosi stampa il riferimento all'oggetto ma non l'oggetto
		// nella classe Libretto creo il metodo toString
		
		List<Voto> venticinque = libretto.listaVotiUguali(25);
		System.out.println(venticinque);
		
		Libretto librettoventicinque = libretto.votiUguali(25);
		System.out.println(librettoventicinque);
	}
}
