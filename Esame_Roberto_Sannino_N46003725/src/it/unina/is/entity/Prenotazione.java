package it.unina.is.entity;

public class Prenotazione {

	private int codice_appello;
	private Studente studente;
	private String corso;
	
	public Prenotazione (Appello appello, Studente studente) {
		this.codice_appello = appello.getCodice();
		this.studente = studente;
		this.corso = appello.getCorso();
	}
	
	public void setNome (String nome) {
		this.studente.setNome(nome); 
	}
	
	public void setCognome (String cognome) {
		this.studente.setCognome(cognome);
	}
	public void setMatricola (String matricola) {
		this.studente.setMatricola(matricola);
	}
	
	public void setCodiceAppello (int codice) {
		this.codice_appello = codice;
	}
	
	public void setCorso (String corso) {
		this.corso = corso;
	}
	
	public String getNome () {
		return studente.getNome();
	}
	
	public String getCognome () {
		return studente.getCognome();
	}
	
	public String getMatricola () {
		return studente.getMatricola();
	}
	
	public int getCodiceAppello () {
		return codice_appello;
	}
	
	public String getCorso () {
		return corso;
	}
	
}
