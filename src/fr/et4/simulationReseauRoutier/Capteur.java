package fr.et4.simulationReseauRoutier;

import java.util.ArrayList;

abstract class Capteur {

    public Capteur() {
        sesElementsDeRegulation = new ArrayList<>();
        sesSemaphores = new ArrayList<>();
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

    public abstract void activer(Voiture v);

}
