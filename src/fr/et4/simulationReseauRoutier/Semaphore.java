package fr.et4.simulationReseauRoutier;

import java.util.ArrayList;

public abstract class Semaphore {

	private static ArrayList<Semaphore> AllSemaphore = new ArrayList<>();
	
    public Semaphore(boolean cote) {
    	extremite = new Extremite(cote);
        sesCapteurs = new ArrayList<>();
        sesElementsDeRegulation = new ArrayList<>();
        AllSemaphore.add(this);
    }

    private boolean active=true;

    public boolean getActive() { return active; }
    public void setActive(boolean active) { this.active = active; }

    private Extremite extremite;

    public Extremite getExtremite() { return extremite; }
    public void setExtremite(Extremite p) { extremite = p; }

    private ArrayList<Capteur> sesCapteurs;

    public ArrayList<Capteur> getSesCapteurs() { return sesCapteurs; }

    private ArrayList<ElementDeRegulation> sesElementsDeRegulation;

    public ArrayList<ElementDeRegulation> getSesElementsDeRegulation() { return sesElementsDeRegulation; }

    public abstract void appliquer(Voiture v);
    public abstract void envoyerSignal(int s);
    
    public void miseAJourTemporelle() {}
    
    public static void Majtemporelle() {
    	for(Semaphore s : AllSemaphore) {
    		s.miseAJourTemporelle();
    	}
    }
}
