import java.time.LocalDate;
import java.time.Month;
import it.unina.is.control.GestoreAppello;
import it.unina.is.control.GestoreCorso;
import it.unina.is.entity.Appello;
import it.unina.is.entity.Corso;
import it.unina.is.entity.Data;
import it.unina.is.entity.Prenotazione;
import it.unina.is.entity.Studente;
import it.unina.is.entity.TipoProva;

public class Main {

	public static void main(String[] args) {
		
						//PRIMA PARTE		

	//Creo due corsi
		Corso analisi = new Corso("analisi", 9);
		Corso fisica = new Corso("fisica", 6);
		
	//Creo la lista dei corsi
		GestoreCorso corsi = new GestoreCorso();
		
    //Aggiungo i corsi alla  lista e la stampo
		corsi.caricaCorso(analisi);
		corsi.caricaCorso(fisica);
		System.out.println("Lista Corsi: ");
		corsi.stampaListaCorso();

						//SECONDA PARTE
	//Creo due appelli 
		Appello analisiGennaio = new Appello("analisi", 101);
		Appello fisicaFebbraio = new Appello("fisica", 201);
		
	//Creo la data di analisiGennaio e la aggiungo all appello
		LocalDate data_analisi = LocalDate.of(2020, Month.JANUARY, 15);
		Data gennaio = new Data("SG1", data_analisi, TipoProva.orale);
		analisiGennaio.caricaData(gennaio);
		
	//Creo le date di fisicaFebbraio e le aggiungo all appello
		LocalDate data_fisica = LocalDate.of(2020, Month.FEBRUARY, 24);
		Data febbraio = new Data("SG1", data_fisica, TipoProva.scritta);
		fisicaFebbraio.caricaData(febbraio);
		LocalDate data_fisica_orale = LocalDate.of(2020, Month.FEBRUARY, 27);
		Data febbraio_orale = new Data("SG2", data_fisica_orale, TipoProva.orale);
		fisicaFebbraio.caricaData(febbraio_orale);
		
	//Creo la lista di appelli
		GestoreAppello appelli = new GestoreAppello();
	
	//Aggiungo gli appelli alla lista e li stampo
		appelli.caricaAppello(analisiGennaio);
		appelli.caricaAppello(fisicaFebbraio);
		System.out.println("\nLista Appelli: \n ");
		appelli.stampaListaAppello();
			
						//TERZA PARTE
	//Creo due studenti
		Studente roberto = new Studente("Roberto", "Sannino", "N46");
		Studente marco = new Studente("Marco", "Crauso", "N49");
		
	//Creo la lista di prenotazioni
		GestoreAppello prenotazioni = new GestoreAppello();
		
	//Creo tre prenotazioni
		Prenotazione p1 = new Prenotazione(analisiGennaio, roberto);
		Prenotazione p2 = new Prenotazione(fisicaFebbraio, roberto);
		Prenotazione p3 = new Prenotazione(fisicaFebbraio, marco);
	
	//Aggiungo le prenotazioni alla lista e la stampo
		prenotazioni.caricaPrenotazione(p1);
		prenotazioni.caricaPrenotazione(p2);
		prenotazioni.caricaPrenotazione(p3);
		System.out.println("\nLista Prenotazioni: \n ");
		prenotazioni.stampaListaPrenotazioni();
	
						//QUARTA PARTE
	//Visualizzo gli studenti prenotati ad un certo appello 
		prenotazioni.consultaStudentiPrenotati(fisicaFebbraio);
	
	}

}
