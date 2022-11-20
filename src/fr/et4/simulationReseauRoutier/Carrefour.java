package fr.et4.simulationReseauRoutier;

public class Carrefour extends Jonction{
	
	@Override
	public void progresser(Voiture v, float f) {
		int d = (int) (Math.random()*(getSesSegments().size()-1));
		Segment from = v.getP().getSegment();
		Segment to = null;
		for(Segment s : getSesSegments()) {
			if(s!=from) {
				if(d==0) {
					to=s;
					break;
				}
				d--;
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
