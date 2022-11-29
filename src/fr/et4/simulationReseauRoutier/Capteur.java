package fr.et4.simulationReseauRoutier;

import java.util.ArrayList;

abstract class Capteur {
	
	private static ArrayList<Capteur> AllCapteur = new ArrayList<>();

    public Capteur(float distance, boolean cote, Segment s) {
    	position = new Position(cote, distance, s);
        sesElementsDeRegulation = new ArrayList<>();
        sesSemaphores = new ArrayList<>();
        AllCapteur.add(this);
    }

    private boolean active;

    public boolean getActive() { return active; }
    public void setActive(boolean active) { this.active = active; }

    private Position position;

    public Position getPosition() { return position; }
    public void setPosition(Position p) { position = p; }

    private ArrayList<ElementDeRegulation> sesElementsDeRegulation;

    public ArrayList<ElementDeRegulation> getSesElementsDeRegulation() { return sesElementsDeRegulation; }

    private ArrayList<Semaphore> sesSemaphores;

    public ArrayList<Semaphore> getSesSemaphores() { return sesSemaphores; }

    public void activer(Voiture v) {
    	for(ElementDeRegulation e : sesElementsDeRegulation) {
    		e.capteurActive(this);
    	}
    	if(active) {
    		System.out.println("La voiture " + v.getId() + " est entrée en collision.");
    	}
    	active=true;
	}
    
    public static void ResetAll() {
    	for(Capteur c : AllCapteur) {
    		c.setActive(false);
    	}
    }

}
