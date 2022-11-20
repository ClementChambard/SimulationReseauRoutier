package fr.et4.simulationReseauRoutier;

public abstract class Semaphore {

    public Semaphore() {
        sesCapteurs = new ArrayList<>();
        sesElementsDeRegularion = new ArrayList<>();
    }

    private boolean active;

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
}
