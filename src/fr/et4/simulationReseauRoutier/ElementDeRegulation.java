package fr.et4.simulationReseauRoutier;

import java.util.ArrayList;

public abstract class ElementDeRegulation {

	private static ArrayList<ElementDeRegulation> AllEdR = new ArrayList<>();
	
    public ElementDeRegulation() {
        sesCapteurs = new ArrayList<>();
        sesSemaphores = new ArrayList<>();
        AllEdR.add(this);
    }


    private ArrayList<Capteur> sesCapteurs;

    public ArrayList<Capteur> getSesCapteurs() { return sesCapteurs; }

    private ArrayList<Semaphore> sesSemaphores;

    public ArrayList<Semaphore> getSesSemaphores() { return sesSemaphores; }

    public abstract void capteurActive(Capteur c);

    public abstract void miseAJourTemporelle();
    
    public static void Majtemporelle() {
    	for(ElementDeRegulation e : AllEdR) {
    		e.miseAJourTemporelle();
    	}
    }

}
