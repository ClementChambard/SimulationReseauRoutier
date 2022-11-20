package fr.et4.simulationReseauRoutier;

public class Segment {

	private float longueur;
	private Voiture voiture;
	private Jonction nord;
	private Jonction sud;

	public float getLongueur() {
		return longueur;
	}

	public void setLongueur(float longueur) {
		this.longueur = longueur;
	}

	public Voiture getVoiture() {
		return voiture;
	}

	public void setVoiture(Voiture voiture) {
		this.voiture = voiture;
	}

	public Jonction getNord() {
		return nord;
	}

	public void setNord(Jonction nord) {
		this.nord = nord;
	}

	public Jonction getSud() {
		return sud;
	}

	public void setSud(Jonction sud) {
		this.sud = sud;
	}
}
