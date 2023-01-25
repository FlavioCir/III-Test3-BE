package app;

import java.time.LocalDate;

import dao.EventoDAO;
import dao.PersonaDAO;
import entities.Sesso;
import entities.TipoEvento;

public class App {

	public static void main(String[] args) {
		
		PersonaDAO.inserisciPersona("Mario", "Rossi", "mario.rossi@gmail.com", LocalDate.parse("1999-11-07"), Sesso.MASCHIO);
		
		boolean inserisciEvento = false;
		boolean eliminaEvento = false;
		boolean getEvento = false;
		boolean modificaEvento = false;
		
		if( inserisciEvento ) {
			
		}
		
		if( eliminaEvento ) {
			
		}
		
		if( getEvento ) {
			
		}
		
		if( modificaEvento ) {
			
		}

	}

}
