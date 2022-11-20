package fr.et4.simulationReseauRoutier;

import java.util.ArrayList;

public class Segment {

	private float longueur;
	private ArrayList<Voiture> voiture;
	private ArrayList<Semaphore> semaphore;
	private ArrayList<Capteur> capteur;
	private Jonction nord;
	private Jonction sud;
	

	public float getLongueur() {
		return longueur;
	}

	public void setLongueur(float longueur) {
		this.longueur = longueur;
	}

	public ArrayList<Voiture> getVoiture() {
		return voiture;
	}

	public void setVoiture(ArrayList<Voiture> voiture) {
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

	public ArrayList<Semaphore> getSemaphore() {
		return semaphore;
	}

	public void setSemaphore(ArrayList<Semaphore> semaphore) {
		this.semaphore = semaphore;
	}

	public ArrayList<Capteur> getCapteur() {
		return capteur;
	}

	public void setCapteur(ArrayList<Capteur> capteur) {
		this.capteur = capteur;
	}
}
