package fr.et4.simulationReseauRoutier;

import java.util.ArrayList;

public abstract class Jonction {
	
	private ArrayList<Segment> sesSegments;

	public abstract void progresser(Voiture v, float f);

	public ArrayList<Segment> getSesSegments() {
		return sesSegments;
	}

	public void setSesSegments(ArrayList<Segment> sesSegments) {
		this.sesSegments = sesSegments;
	}
}
