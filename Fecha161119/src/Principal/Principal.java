package Principal;

import Clases.Hora;

public class Principal {

	public static void main(String[] args) {
		Hora h = new Hora();
		h.setHora(12);
		h.setMinutos(15);
		h.setSegundos(35);
		
		System.out.println("La hora es: " + h.getHora() + ":" + h.getMinutos() + ":" + h.getSegundos());
	}

}
