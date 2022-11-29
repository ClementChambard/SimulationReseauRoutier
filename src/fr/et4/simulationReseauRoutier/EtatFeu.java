package fr.et4.simulationReseauRoutier;

public enum EtatFeu {

	VERT, ROUGE, ORANGE;
	
	public void appliquer(Voiture v) {
		switch(this) {
		case VERT:
			v.setVitesse(v.getVitesseLimite());
			break;
		case ORANGE:
			v.setVitesse(v.getVitesse()/2);
			break;
		case ROUGE:
			v.setVitesse(0);
			System.out.println("La voiture " + v.getId() + " est arrêtée à un feu rouge.");
			break;
		}
	}
}