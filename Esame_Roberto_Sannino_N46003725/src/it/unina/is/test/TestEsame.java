package it.unina.is.test;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.time.Month;

import org.junit.Test;

import it.unina.is.control.GestoreAppello;
import it.unina.is.entity.Appello;
import it.unina.is.entity.Data;
import it.unina.is.entity.Prenotazione;
import it.unina.is.entity.Studente;
import it.unina.is.entity.TipoProva;

public class TestEsame {

	@Test
	public void test1() {
		//Prenotazione di uno studente a un appello con una data 
		
		//valore che mi aspetto 
		int expected = 1;
		
		//creo un appello
		Appello analisiGennaio = new Appello("analisi", 101);
		
		//creo una data per l appello
		LocalDate data_analisi = LocalDate.of(2020, Month.JANUARY, 15);
		Data gennaio = new Data("SG1", data_analisi, TipoProva.orale);
		analisiGennaio.caricaData(gennaio);
		
		//creo uno studente
		Studente roberto = new Studente("Roberto", "Sannino", "N46");
		
		//Creo la lista di prenotazioni
		GestoreAppello prenotazioni = new GestoreAppello();
		
		//Creo una prenotazione
		Prenotazione p1 = new Prenotazione(analisiGennaio, roberto);
		
		//Aggiungo la prenotazione alla lista
		prenotazioni.caricaPrenotazione(p1);
		
		assertEquals(expected, prenotazioni.consultaStudentiPrenotati(analisiGennaio));
	}
	
	@Test
	public void test2() {
		//Prenotazione di uno studente a più appelli diversi con una data
		
		//valore che mi aspetto 
		int expected = 2;
				
		//creo due appelli
		Appello analisiGennaio = new Appello("analisi", 101);
		Appello fisicaFebbraio = new Appello("fisica", 201);
				
		//creo una data per ogni appello
		LocalDate data_analisi = LocalDate.of(2020, Month.JANUARY, 15);
		Data gennaio = new Data("SG1", data_analisi, TipoProva.orale);
		analisiGennaio.caricaData(gennaio);
		
		LocalDate data_fisica = LocalDate.of(2020, Month.FEBRUARY, 24);
		Data febbraio = new Data("SG1", data_fisica, TipoProva.scritta);
		fisicaFebbraio.caricaData(febbraio);
		
		//creo uno studente
		Studente roberto = new Studente("Roberto", "Sannino", "N46");
			
		//Creo la lista di prenotazioni
		GestoreAppello prenotazioni = new GestoreAppello();
				
		//Creo due prenotazioni
		Prenotazione p1 = new Prenotazione(analisiGennaio, roberto);
		Prenotazione p2 = new Prenotazione(fisicaFebbraio, roberto);
		
		//Aggiungo le prenotazioni alla lista
		prenotazioni.caricaPrenotazione(p1);
		prenotazioni.caricaPrenotazione(p2);
		
		int answer = prenotazioni.consultaStudentiPrenotati(analisiGennaio);
		answer += prenotazioni.consultaStudentiPrenotati(fisicaFebbraio);
				
		assertEquals(expected, answer);
	}
	
	@Test
	public void test3() {
		//Prenotazione di uno studente a zero appelli
		
		//valore che mi aspetto 
		int expected = 0;
		
		//creo un appello
		Appello analisiGennaio = new Appello("analisi", 101);
		
		//creo uno studente
		Studente roberto = new Studente("Roberto", "Sannino", "N46");
		roberto.setNome("Mirco");
		
		//Creo la lista di prenotazioni
		GestoreAppello prenotazioni = new GestoreAppello();
		
		assertEquals(expected, prenotazioni.consultaStudentiPrenotati(analisiGennaio));
		
	}
	
	@Test
	public void test4() {
		//Prenotazione di più studenti a un appello con una data
		
		//valore che mi aspetto 
		int expected = 3;
				
		//creo un appello
		Appello analisiGennaio = new Appello("analisi", 101);
				
		//creo una data per l appello
		LocalDate data_analisi = LocalDate.of(2020, Month.JANUARY, 15);
		Data gennaio = new Data("SG1", data_analisi, TipoProva.orale);
		analisiGennaio.caricaData(gennaio);
				
		//creo tre studenti
		Studente roberto = new Studente("Roberto", "Sannino", "N46");
		Studente marco = new Studente("Marco", "Crauso", "N49");
		Studente enzo = new Studente("Vincenzo", "Mazzella", "N49");
				
		//Creo la lista di prenotazioni
		GestoreAppello prenotazioni = new GestoreAppello();
				
		//Creo tre prenotazioni
		Prenotazione p1 = new Prenotazione(analisiGennaio, roberto);
		Prenotazione p2 = new Prenotazione(analisiGennaio, marco);
		Prenotazione p3 = new Prenotazione(analisiGennaio, enzo);
				
		//Aggiungo le prenotazioni alla lista
		prenotazioni.caricaPrenotazione(p1);
		prenotazioni.caricaPrenotazione(p2);
		prenotazioni.caricaPrenotazione(p3);
				
		assertEquals(expected, prenotazioni.consultaStudentiPrenotati(analisiGennaio));
		
	}
	
	@Test
	public void test5() {
		//Prenotazione di più studenti a più appelli con una data
		
		//valore che mi aspetto 
		int expected = 3;
						
		//creo due appelli
		Appello analisiGennaio = new Appello("analisi", 101);
		Appello fisicaFebbraio = new Appello("fisica", 201);
						
		//creo una data per ogni appello
		LocalDate data_analisi = LocalDate.of(2020, Month.JANUARY, 15);
		Data gennaio = new Data("SG1", data_analisi, TipoProva.orale);
		analisiGennaio.caricaData(gennaio);
				
		LocalDate data_fisica = LocalDate.of(2020, Month.FEBRUARY, 24);
		Data febbraio = new Data("SG1", data_fisica, TipoProva.scritta);
		fisicaFebbraio.caricaData(febbraio);
						
		//creo due studenti
		Studente roberto = new Studente("Roberto", "Sannino", "N46");
		Studente marco = new Studente("Marco", "Crauso", "N49");
						
		//Creo la lista di prenotazioni
		GestoreAppello prenotazioni = new GestoreAppello();
						
		//Creo tre prenotazioni
		Prenotazione p1 = new Prenotazione(analisiGennaio, roberto);
		Prenotazione p2 = new Prenotazione(analisiGennaio, marco);
		Prenotazione p3 = new Prenotazione(fisicaFebbraio, roberto);
						
		//Aggiungo le prenotazioni alla lista
		prenotazioni.caricaPrenotazione(p1);
		prenotazioni.caricaPrenotazione(p2);
		prenotazioni.caricaPrenotazione(p3);
		
		int answer = prenotazioni.consultaStudentiPrenotati(analisiGennaio);
		answer += prenotazioni.consultaStudentiPrenotati(fisicaFebbraio);
				
		assertEquals(expected, answer);
		
	}
	
	@Test
	public void test6() {
		//Prenotazione di uno studente a un appello con più date
		
		//valore che mi aspetto
		int expected = 1;
		
		//creo un appello
		Appello analisiGennaio = new Appello("analisi", 101);
		
		//creo due date per l appello
		LocalDate data_analisi = LocalDate.of(2020, Month.JANUARY, 27);
		Data gennaio = new Data("SG1", data_analisi, TipoProva.scritta);
		analisiGennaio.caricaData(gennaio);
		
		LocalDate data_analisi_orale = LocalDate.of(2020, Month.FEBRUARY, 3);
		Data febbraio_orale = new Data("SG2", data_analisi_orale, TipoProva.orale);
		analisiGennaio.caricaData(febbraio_orale);
		
		//creo uno studente
		Studente roberto = new Studente("Roberto", "Sannino", "N46");
		
		//Creo la lista di prenotazioni
		GestoreAppello prenotazioni = new GestoreAppello();
		
		//Creo una prenotazione
		Prenotazione p1 = new Prenotazione(analisiGennaio, roberto);
		
		//Aggiungo la prenotazione alla lista
		prenotazioni.caricaPrenotazione(p1);
		
		assertEquals(expected, prenotazioni.consultaStudentiPrenotati(analisiGennaio));
		
	}
	
	@Test
	public void test7() {
		//Prenotazione di più studenti a  più appelli con più  date
		
		//valore che mi aspetto
		int expected = 4;
		
		//Creo due appelli 
		Appello analisiGennaio = new Appello("analisi", 101);
		Appello fisicaFebbraio = new Appello("fisica", 201);
		
		//creo due date per ogni appello
		LocalDate data_analisi = LocalDate.of(2020, Month.JANUARY, 27);
		Data gennaio = new Data("SG1", data_analisi, TipoProva.scritta);
		analisiGennaio.caricaData(gennaio);
		
		LocalDate data_analisi_orale = LocalDate.of(2020, Month.FEBRUARY, 3);
		Data febbraio_orale = new Data("SG2", data_analisi_orale, TipoProva.orale);
		analisiGennaio.caricaData(febbraio_orale);
		
		LocalDate data_fisica = LocalDate.of(2020, Month.FEBRUARY, 24);
		Data febbraio = new Data("SG1", data_fisica, TipoProva.scritta);
		fisicaFebbraio.caricaData(febbraio);
		
		LocalDate data_fisica_orale = LocalDate.of(2020, Month.FEBRUARY, 27);
		Data Febbraio_orale = new Data("SG2", data_fisica_orale, TipoProva.orale);
		fisicaFebbraio.caricaData(Febbraio_orale);
		
		//creo due studenti
		Studente roberto = new Studente("Roberto", "Sannino", "N46");
		Studente marco = new Studente("Marco", "Crauso", "N49");
		
		//Creo la lista di prenotazioni
		GestoreAppello prenotazioni = new GestoreAppello();
		
		//Creo una prenotazione
		Prenotazione p1 = new Prenotazione(analisiGennaio, roberto);
		Prenotazione p2 = new Prenotazione(fisicaFebbraio, roberto);
		Prenotazione p3 = new Prenotazione(analisiGennaio, marco);
		Prenotazione p4 = new Prenotazione(fisicaFebbraio, marco);
		
		
		//Aggiungo la prenotazione alla lista
		prenotazioni.caricaPrenotazione(p1);
		prenotazioni.caricaPrenotazione(p2);
		prenotazioni.caricaPrenotazione(p3);
		prenotazioni.caricaPrenotazione(p4);
		
		int answer = prenotazioni.consultaStudentiPrenotati(analisiGennaio);
		answer += prenotazioni.consultaStudentiPrenotati(fisicaFebbraio);
		
		assertEquals(expected, answer);
	}
	
}
