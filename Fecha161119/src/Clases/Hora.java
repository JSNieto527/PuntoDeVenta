package Clases;

public class Hora {

	int hora;
	int minutos;
	int segundos;
	String ampm;
	String resultado;

	public Hora() {
		
	}
	
	public Hora(int hora, int minutos, int segundos) {
		
		this.hora = hora;
		this.minutos = minutos;
		this.segundos = segundos;
		
	}

	public int getHora() {
		return this.hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public int getMinutos() {
		return this.minutos;
	}

	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}

	public int getSegundos() {
		return this.segundos;
	}

	public void setSegundos(int segundos) {
		this.segundos = segundos;
	}
}
