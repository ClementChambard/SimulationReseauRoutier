package fr.et4.simulationReseauRoutier;

public class PanneauDeLimitation extends Semaphore {

    private float vitesseLimite;

    public float getVitesseLimite() { return vitesseLimite; }
    public void setVitesseLimite(float v) { vitesseLimite = v; }

    @Override
    public void appliquer(Voiture v) {}

    @Override
    public void envoyerSignal(int s) {}
}
