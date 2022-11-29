package fr.et4.simulationReseauRoutier;

class CapteurDeVitesse extends Capteur {
	
    public CapteurDeVitesse(float distance, boolean cote, Segment s) {
		super(distance, cote, s);
	}

	@Override
    public void activer(Voiture v) {
    	super.activer(v);
    	System.out.println("La voiture " + v.getId() + " est pass�e sur un capteur de vitesse � " + v.getVitesse());    	
    }
}
