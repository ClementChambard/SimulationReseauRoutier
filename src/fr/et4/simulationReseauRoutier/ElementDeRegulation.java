package fr.et4.simulationReseauRoutier;

public abstract class ElementDeRegulation {

    public ElementDeRegulation() {
        sesCapteurs = new ArrayList<>();
        sesSemaphores = new ArrayList<>();
    }


    private ArrayList<Capteur> sesCapteurs;

    public ArrayList<Capteur> getSesCapteurs() { return sesCapteurs; }

    private ArrayList<Semaphore> sesSemaphores;

    public ArrayList<Semaphore> getSesSemaphores() { return sesSemaphores; }

    public abstract void capteurActive(Capteur c);

    public abstract void miseAJourTemporelle();

}
