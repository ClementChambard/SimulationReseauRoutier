package fr.et4.simulationReseauRoutier;

import java.util.ArrayList;

public class Voiture {

	private int id;
	private static int nextid=1;
	private float vitesseMax;
	private float vitesse;
	private Position p;
	private float vitesseLimite;
	private static ArrayList<Voiture> AllVoiture = new ArrayList<>();
	
	public Voiture(float vitesse){
		this.id=nextid++;
		this.vitesse=vitesse;
		vitesseMax=vitesse;
		vitesseLimite=vitesse;
		AllVoiture.add(this);
	}
	
	public void avancer(float a) {
		// Verifier capteur sur segment actuel
		float distancei = p.getDistance();
		float distancef = distancei+a;
		Segment segment = p.getSegment();
		for(Capteur c : segment.getCapteur()) {
			if(c.getPosition().getCote()!=p.getCote()) {
				continue;
			}
			float distancecapteur = c.getPosition().getDistance();
			if(distancecapteur<distancef && distancecapteur>distancei) {
				c.activer(this);
			}
		}
					
		if(distancef>=segment.getLongueur()) {
			for(Semaphore s : segment.getSemaphore()) {
				if(s.getExtremite().getCote()==p.getCote()) {
					s.appliquer(this);
				}
			}
			// recalculer a si la vitesse a changé
			float distancesegment = segment.getLongueur()-distancei;
			float pourcentrestant = 1-(distancesegment/a);
			a=pourcentrestant*vitesse;
			if(a==0) {
				p.setDistance(segment.getLongueur());
				return;
			}

			Jonction j = segment.getNord();
			if(p.getCote()) {
				j = segment.getSud();
			}
			j.progresser(this, a);
			return;
		}
		p.setDistance(distancef);
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
	
    public static void Majtemporelle() {
    	for(Voiture v : AllVoiture) {
    		v.avancer(v.vitesse);
    	}
    }
}
