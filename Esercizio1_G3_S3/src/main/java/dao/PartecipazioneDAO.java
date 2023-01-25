package dao;

import entities.Evento;
import entities.Partecipazione;
import entities.Persona;
import entities.Stato;
import utils.JpaUtil;

public class PartecipazioneDAO extends JpaUtil {

	public static void aggiungiPartecipazione(Evento evento, Persona persona, Stato stato) {
		t.begin();
		
		Partecipazione p = new Partecipazione();
		p.setPersona(persona);
		p.setEvento(evento);
		p.setStato(stato);
		
		em.persist(p);
		t.commit();
	}
	
}
