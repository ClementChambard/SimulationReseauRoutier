package fr.et4.simulationReseauRoutier;

public class PanneauDeLimitation extends Semaphore {

    public PanneauDeLimitation(boolean cote, float vlimite) {
		super(cote);
		this.vitesseLimite=vlimite;
	}

	private float vitesseLimite;

    public float getVitesseLimite() { return vitesseLimite; }
    public void setVitesseLimite(float v) { vitesseLimite = v; }

    @Override
    public void appliquer(Voiture v) {
    	if(getActive()) {
    		v.setVitesse(vitesseLimite);
    		v.setVitesseLimite(vitesseLimite);
    	}
    }

    @Override
    public void envoyerSignal(int s) {
    	// Pas de signal pour un panneau de vitesse
    }
}
