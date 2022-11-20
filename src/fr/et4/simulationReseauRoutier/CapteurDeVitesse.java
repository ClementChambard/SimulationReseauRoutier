package fr.et4.simulationReseauRoutier;

class CapteurDeVitesse extends Capteur {

    @Override
    public void activer(Voiture v) {
    	for(ElementDeRegulation e : getSesElementsDeRegulation()) {
    		e.capteurActive(this);
    	}
    	// notifié
    }
}
