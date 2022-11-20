package fr.et4.simulationReseauRoutier;

public class FeuTricolore extends Feu {

    @Override
    public void envoyerSignal(int s) {
    	if(getEtat()==EtatFeu.VERT) {
    		setEtat(EtatFeu.ORANGE);
    	}
    	else if (getEtat()==EtatFeu.ORANGE)  {
    		setEtat(EtatFeu.ROUGE);
    	}
    	else {
    		setEtat(EtatFeu.VERT);
    	}
    }

}
