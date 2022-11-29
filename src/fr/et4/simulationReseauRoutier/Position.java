package fr.et4.simulationReseauRoutier;

public class Position {

	private boolean cote; // Par convention Nord vers Sud = true et Sud vers Nord = false
	private float distance;
	private Segment segment;
	
	public Position(boolean c, float distance, Segment segment) {
		this.cote=c;
		this.distance=distance;
		this.segment=segment;
	}

	public boolean getCote() {
		return cote;
	}
	public void setCote(boolean cote) {
		this.cote = cote;
	}
	
	public float getDistance() {
		return distance;
	}
	public void setDistance(float distance) {
		this.distance = distance;
	}
	public Segment getSegment() {
		return segment;
	}
	public void setSegment(Segment segment) {
		this.segment = segment;
	}
}
