package fr.et4.simulationReseauRoutier;

public abstract class Feu extends Semaphore {

    private EtatFeu etat;

    public EtatFeu getEtat() { return etat; }
    public void setEtat(EtatFeu e) { etat = e; }

    @Override
    public void appliquer(Voiture v) { etat.appliquer(v); }
}
