package dao;

import entities.Location;
import utils.JpaUtil;

public class LocationDAO extends JpaUtil {

	public static void aggiungiLocation(String nome, String citta) {
		t.begin();
		
		Location l = new Location();
		l.setNome(nome);
		l.setCitta(citta);
		
		em.persist(l);
		t.commit();
	}
	
}
