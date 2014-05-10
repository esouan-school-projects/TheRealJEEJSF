package fr.epsi;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class MonControleur {

	private String resultat;

	public String getResultat() {
		return resultat;
	}

	public void traiter() {
		resultat = "Bravo, vous avez fait une requête Ajax !";
	}

}
