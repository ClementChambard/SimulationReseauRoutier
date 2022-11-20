package fr.et4.simulationReseauRoutier;

public class Position {

	private boolean cote;
	private float distance;
	private Segment segment;
	
	public boolean isCote() {
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
