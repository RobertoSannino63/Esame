package it.unina.is.control;

import java.util.ArrayList;

import it.unina.is.entity.Appello;
import it.unina.is.entity.Prenotazione;

public class GestoreAppello {
	
	private ArrayList<Appello> lista_appello = new ArrayList<>();
	private ArrayList<Prenotazione> lista_prenotazioni = new ArrayList<>();
	
	public GestoreAppello() {
		
	}
	
	//Secondo Punto
	
	public void caricaAppello(Appello appello) {
		
		lista_appello.add(appello);
	}
	
	public void rimuoviAppello(Appello appello ) {
		
		lista_appello.remove(appello);
	}
	
	public void stampaListaAppello () {
		for(Appello a : lista_appello) {
			System.out.println("Corso: " + a.getCorso() + " CodiceAppello: " + a.getCodice() + "\n" );
			a.stampaDate();
		}
	}
	
	//Terzo Punto
	
	public void caricaPrenotazione(Prenotazione prenotazione) {
		
		lista_prenotazioni.add(prenotazione);
	}
	
	public void rimuoviPrenotazione(Prenotazione prenotazione) {
		
		lista_prenotazioni.remove(prenotazione);
	}
	
	public void stampaListaPrenotazioni () {
		for(Prenotazione p : lista_prenotazioni) {
			System.out.println("Corso: " + p.getCorso() + " CodiceAppello: " + p.getCodiceAppello() 
				+ " Studente: " + p.getNome() + " " + p.getCognome() + " " + p.getMatricola() + "\n" );
		}
	}
	
	//Quarto Punto
	
	public int consultaStudentiPrenotati(Appello appello) {
		System.out.println("\n Studenti prenotati all' appello di " + appello.getCorso() 
		+ " codice: " + appello.getCodice() );
		int numeroSudentiPrenotati = 0;
		for(Prenotazione p : lista_prenotazioni) {
			if(appello.getCodice() == p.getCodiceAppello()) {
				System.out.println("\n " +p.getCognome()+ " " +p.getNome() + " " + p.getMatricola());
				numeroSudentiPrenotati++;
			}
		}
		System.out.println("\nIl numero totale di studenti prenotati è: " + numeroSudentiPrenotati);
		return numeroSudentiPrenotati;
	}
	
}
