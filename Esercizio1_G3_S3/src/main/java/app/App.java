package app;

import java.time.LocalDate;
import java.util.HashSet;

import javax.persistence.Embeddable;

import dao.EventoDAO;
import dao.LocationDAO;
import dao.PersonaDAO;
import entities.Evento;
import entities.Location;
import entities.Partecipazione;
import entities.Persona;
import entities.Sesso;
import entities.Stato;
import entities.TipoEvento;
import utils.JpaUtil;

public class App extends JpaUtil {
	
	public static void inserisciDati() {
		
		t.begin();
		
		
		
		Persona p1 = new Persona();
		p1.setNome("Mario");
		p1.setCognome("Rossi");
		p1.setEmail("mario@rossi.com");
		p1.setDatadinascita(LocalDate.parse("1999-11-07"));
		p1.setSesso(Sesso.MASCHIO);
		
		em.persist(p1);
		
		Location l1 = new Location();
		l1.setNome("Atlantico");
		l1.setCitta("Roma");
		
		em.persist(l1);
		
		Evento e = new Evento();
		e.setTitolo("Discoteca");
		e.setDataEvento(LocalDate.parse("2023-07-11"));
		e.setDescrizione("Venite a divertirti da noi con musica e ospiti speciali");
		e.setTipoEvento(TipoEvento.PUBBLICO);
		e.setNumeroMaxPartecipanti(400);
		e.setLocation(l1);
		
		Partecipazione pa1 = new Partecipazione();
		pa1.setPersona(p1);
		pa1.setStato(Stato.CONFERMATA);
		pa1.setEvento(e);
		
		
	}

	public static void main(String[] args) {
		
		
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
