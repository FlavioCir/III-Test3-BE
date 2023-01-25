package dao;

import java.time.LocalDate;

import entities.Persona;
import entities.Sesso;
import utils.JpaUtil;

public class PersonaDAO extends JpaUtil {

	public static void inserisciPersona(String nome, String cognome, String email, LocalDate datadinascita, Sesso sesso) {
		
		t.begin();
		
		Persona pe = new Persona();
		pe.setNome(nome);
		pe.setCognome(cognome);
		pe.setEmail(email);
		pe.setDatadinascita(datadinascita);
		pe.setSesso(sesso);
		
		em.persist(pe);
		t.commit();
		
	}
	
}
