package it.polito.tdp.libretto.model;

import java.time.*;

public class TestLibretto {

	public static void main(String[] args) {
		
		Libretto l = new Libretto();
		
		//Inseriamo 10 esami:
		l.add(new Voto("Analisi 1", 29, LocalDate.of(2021, 2, 12)));
		l.add(new Voto("Fisica 1", 20, LocalDate.of(2021, 2, 19)));
		l.add(new Voto("Algebra Lineare e Geometria", 18, LocalDate.of(2020, 6, 29)));
		l.add(new Voto("Programmazione ad Oggetti", 25, LocalDate.of(2022, 9, 3)));
		l.add(new Voto("Tecniche di Programmazione", 28, LocalDate.of(2023, 7, 8)));
		l.add(new Voto("Chimica", 19, LocalDate.of(2019, 2, 24)));
		l.add(new Voto("Informatica", 25, LocalDate.of(2019, 2, 1)));
		l.add(new Voto("Sistemi di Produzione", 21, LocalDate.of(2023, 9, 5)));
		l.add(new Voto("Fisica 2", 18, LocalDate.of(2023, 9, 10)));
		l.add(new Voto("Sistemi Elettrici Industriali", 30, LocalDate.of(2022, 1, 17)));

		System.out.println(" Lista di esami registrati nel formato (NomeEsame, VotoEsame, DataEsame):");
		l.stampa();
		
		System.out.println("\n Lista di esami con voto pari a 25:");
		l.stampaEsamiConVotoPariA(25);
		
		System.out.print("\n Esiste l'esame (Analisi 1) nel libretto:   ");
		Voto votoCercato = l.cercaVotoPerNome("Analisi 1");
		System.out.println(votoCercato);
		System.out.print(" Esiste l'esame (Analisi 2) nel libretto:   ");
		Voto votoCercato2 = l.cercaVotoPerNome("Analisi 2");
		System.out.println(votoCercato2);
		
		Voto votoEsistente = new Voto("Fisica 2", 18, LocalDate.of(2023, 2, 19));
		Voto votoEsistente2 = new Voto("Fisica 2", 26, LocalDate.of(2023, 2, 19));
		System.out.print("\n L'esame ("+ votoEsistente +") è duplicato nel libretto (con lo stesso voto):  ");
		System.out.println("" + l.esisteVoto(votoEsistente));
		System.out.print(" L'esame ("+ votoEsistente2 +") è duplicato nel libretto (con lo stesso voto):  ");
		System.out.println("" + l.esisteVoto(votoEsistente2));
	}

}
