package it.polito.tdp.libretto.model;

import java.util.*;

public class Libretto {
	
	private List<Voto> voti;

	public Libretto() {
		this.voti = new ArrayList<Voto>();  }
	
	public boolean add(Voto v) {
		return this.voti.add(v);  }
	
	public void stampa() {
		for(Voto v: voti) {
			System.out.println(v);  }  }
	
	//caso generico in cui non mettiamo la costante 25 nel codice:
	public void stampaEsamiConVotoPariA(int numero) {  
		for(Voto v: voti) {
			if(v.getVotoEsame() == numero) {
			System.out.println(v);   } }   }
	
	public Voto cercaVotoPerNome(String corsoDaCercare) {
		for(Voto v: voti) {
				if(v.getCorso().equals(corsoDaCercare)) {
			  //if(v.getCorso().compareTo(corsoDaCercare)==0) {
				return v;  }  }
		
		return null;  //oppure throw new RuntimeException("Voto non trovato");
		//non la consideriamo un'eccezione in quanto è un caso contemplato
		//in una ricerca non trovare il valore cercato
	}
	
	public boolean esisteVoto(Voto votoDaCercare) {
		for(Voto v: voti) {
			if(v.getCorso().equals(votoDaCercare.getCorso()) && 
					v.getVotoEsame() == votoDaCercare.getVotoEsame()) {
					return true;   } }
		return false;  }
	
 }
