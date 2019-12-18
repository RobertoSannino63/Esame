package it.unina.is.entity;

import java.util.ArrayList;

public class Appello {

	private String  corso;
	private int codice;
	private ArrayList<Data> date = new ArrayList<>();
	
	public Appello(String corso, int codice) {
		this.corso = corso;
		this.codice = codice;
	}
	
	public String getCorso() {
		return corso;
	}
	
	public int getCodice() {
		return codice;
	}
	
	public void setCorso(String  corso) {
		this.corso = corso;
	}
	
	public void setCodice(int codice) {
		this.codice = codice;
	}
	
	public void caricaData(Data data) {
		date.add(data);
	}
	
	public void rimuoviData(Data data) {
		date.remove(data);
	}
	
	public void stampaDate(){
		for(Data d : date ) {
			System.out.println("Aula: " + d.getAula() + " Data: " + d.getData()
							+ " Tipo: " + d.geTipo() + "\n");
		}
	}
	
}
