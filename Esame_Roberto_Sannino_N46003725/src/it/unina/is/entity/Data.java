package it.unina.is.entity;
import java.time.LocalDate;

public class Data {

	private String aula;
	private LocalDate data;
	private TipoProva tipo;
	
	public Data (String aula, LocalDate data, TipoProva tipo) {
		this.aula = aula;
		this.data = data;
		this.tipo = tipo;
	}
	
	public String getAula() {
		return aula;
	}
	
	public LocalDate getData() {
		return data;
	}
	
	public TipoProva geTipo() {
		return tipo;
	}
	
	public void setAula(String aula) {
		this.aula = aula;
	}
	
	public void setData(LocalDate data) {
		this.data = data;
	}
	
	public void setTipo(TipoProva tipo) {
		this.tipo = tipo;
	}
}
