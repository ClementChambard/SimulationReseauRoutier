package fr.et4.simulationReseauRoutier;

public class RegulationCarrefour4Feux extends ElementDeRegulation {

	private int temporisateur=0;
	
	public RegulationCarrefour4Feux() {
		super();
	}
	
    @Override
    public void capteurActive(Capteur c) {
    	int capteurid = getSesCapteurs().indexOf(c);
    	if(capteurid%2==0) {
    		if(((Feu) getSesSemaphores().get(0)).getEtat()!=EtatFeu.VERT) { return; }
    		getSesSemaphores().get(0).envoyerSignal(0);
    		getSesSemaphores().get(2).envoyerSignal(0);
    		getSesSemaphores().get(1).envoyerSignal(0);
    		getSesSemaphores().get(3).envoyerSignal(0);
    		temporisateur=0;
    	}
    	else {
    		if(((Feu) getSesSemaphores().get(0)).getEtat()==EtatFeu.VERT) { return; }
    		getSesSemaphores().get(0).envoyerSignal(0);
    		getSesSemaphores().get(2).envoyerSignal(0);
    		getSesSemaphores().get(1).envoyerSignal(0);
    		getSesSemaphores().get(3).envoyerSignal(0);
    		temporisateur=0;
    	}
    }

    @Override
    public void miseAJourTemporelle() {
    	temporisateur++;
    	if(temporisateur==5) {
    		getSesSemaphores().get(0).envoyerSignal(0);
    		getSesSemaphores().get(2).envoyerSignal(0);
    		getSesSemaphores().get(1).envoyerSignal(0);
    		getSesSemaphores().get(3).envoyerSignal(0);
    		temporisateur=0;
    	}
    }
}
