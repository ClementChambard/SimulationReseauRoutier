package fr.et4.simulationReseauRoutier;

public class Voiture {

	private int id;
	private float vitesseMax;
	private float vitesse;
	private Position p;
	private float vitesseLimite;
	
	public void avancer(float a) {
		// Verifier capteur sur segment actuel
		if(p.getDistance()+a>p.getSegment().getLongueur()) {
			for(Semaphore s : p.getSegment().getSemaphore()) {
				if(s.getExtremite().getCote()==p.getCote()) {
					s.appliquer(this);
				}
			}
			// recalculer a si la vitesse a changé
			Jonction j = p.getSegment().getNord();
			if(p.getCote()) {
				j = p.getSegment().getSud();
			}
			j.progresser(this, a);
		}
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getVitesseMax() {
		return vitesseMax;
	}

	public void setVitesseMax(float vitesseMax) {
		this.vitesseMax = vitesseMax;
	}

	public float getVitesse() {
		return vitesse;
	}

	public void setVitesse(float vitesse) {
		this.vitesse = Math.min(vitesse, vitesseMax);
	}

	public Position getP() {
		return p;
	}

	public void setP(Position p) {
		this.p = p;
	}

	public float getVitesseLimite() {
		return vitesseLimite;
	}

	public void setVitesseLimite(float vitesseLimite) {
		this.vitesseLimite = vitesseLimite;
	}
	
	
}
