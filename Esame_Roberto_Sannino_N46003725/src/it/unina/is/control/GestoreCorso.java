package it.unina.is.control;

import java.util.ArrayList;

import it.unina.is.entity.Corso;


public class GestoreCorso {
	
	private ArrayList<Corso> lista_corso;
	
	public GestoreCorso() {
		
		lista_corso = new ArrayList<> ();
	
	}
	
	public void caricaCorso(Corso corso) {
		
		lista_corso.add(corso);
	}
	
	public void rimuoviCorso(Corso corso ) {
		
		lista_corso.remove(corso);
	}
	
	public void stampaListaCorso () {
		for(Corso c : lista_corso) {
			System.out.println("\n" + c.getNome());
		}
	}
	
}
