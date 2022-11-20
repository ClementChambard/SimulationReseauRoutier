package fr.et4.simulationReseauRoutier;

public class JonctionSimple extends Jonction {

	@Override
	public void progresser(Voiture v, float f) {
		Segment from = v.getP().getSegment();
		Segment to = null;
		for(Segment s : getSesSegments()) {
			if(s!=from) {
				to=s;
				break;
			}
		}
		f-=1;
		boolean c = false;
		if(to.getNord()==this) {
			c=true;
		}
		v.setP(new Position(c, 0, to));
		v.avancer(f);
	}

}
