package fr.et4.simulationReseauRoutier;

public class FeuBicolore extends Feu {

    @Override
	public void envoyerSignal(int s) {
    	if(getEtat()==EtatFeu.VERT) {
    		setEtat(EtatFeu.ROUGE);
    	}
    	else {
    		setEtat(EtatFeu.VERT);
    	}
    }

}
