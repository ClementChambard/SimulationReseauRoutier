package fr.et4.simulationReseauRoutier;

public class Barriere extends Jonction {

	public Barriere(Segment s) {
		super();
		getSesSegments().add(s);
	}
	@Override
	public void progresser(Voiture v, float f) {
		System.out.println("La voiture " + v.getId() + " essaye de passer une barri�re.");
		v.setP(new Position(!v.getP().getCote(), 0, this.getSesSegments().get(0)));
		v.avancer(f);
	}

}
