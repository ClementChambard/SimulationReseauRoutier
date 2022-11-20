package fr.et4.simulationReseauRoutier;

public class CapteurDePresence extends Capteur {

    @Override
    public void activer(Voiture v) {
    	for(ElementDeRegulation e : getSesElementsDeRegulation()) {
    		e.capteurActive(this);
    	}
    	// notifié
    }
}
