package fr.et4.simulationReseauRoutier;

public class FeuBicolore extends Feu {

    public FeuBicolore(boolean cote) {
		super(cote);
	}

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
