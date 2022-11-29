package fr.et4.simulationReseauRoutier;

public class FeuTricolore extends Feu {

	public FeuTricolore(boolean cote) {
		super(cote);
	}

	private int temporisateur=0;
	
    @Override
    public void envoyerSignal(int s) {
    	if(getEtat()==EtatFeu.VERT) {
    		setEtat(EtatFeu.ORANGE);
    		temporisateur=0;
    	}
    	else if (getEtat()==EtatFeu.ORANGE)  {
    		setEtat(EtatFeu.ROUGE);
    	}
    	else {
    		setEtat(EtatFeu.VERT);
    	}
    }
    
    @Override
    public void miseAJourTemporelle() {
    	if(getEtat()==EtatFeu.ORANGE && temporisateur == 2) {
    		setEtat(EtatFeu.ROUGE);
    	}
    	temporisateur++;
    }

}
