package fr.et4.simulationReseauRoutier;

import java.util.ArrayList;

public class Main {
	
	public static void main(String[] arg){
		Voiture v1 = new Voiture();
		Voiture v2 = new Voiture();
		Voiture v3 = new Voiture();
		Segment s1 = new Segment(10);
		Segment s2 = new Segment(20);
		Segment s3 = new Segment(20);
		Segment s4 = new Segment(20);
		Segment s5 = new Segment(20);
		Segment s6 = new Segment(50);
		Segment s7 = new Segment(50);
		Barriere b1 = new Barriere(s1);
		s1.setNord(b1);
		JonctionSimple j1 = new JonctionSimple(s1,s2);
		s1.setSud(j1);
		s2.setNord(j1);
		JonctionSimple j2 = new JonctionSimple(s3,s6);	
		s3.setNord(j2);
		s6.setSud(j2);
		JonctionSimple j3 = new JonctionSimple(s5,s7);
		s5.setSud(j3);
		s7.setNord(j3);
		ArrayList<Segment> coll1 = new ArrayList<>();
		coll1.add(s2);
		coll1.add(s3);
		coll1.add(s4);
		coll1.add(s5);
		Carrefour c1 = new Carrefour(coll1);
		s2.setSud(c1);
		s4.setNord(c1);
		s3.setSud(c1);
		s5.setNord(c1);
		ArrayList<Segment> coll2 = new ArrayList<>();
		coll2.add(s6);
		coll2.add(s4);
		coll2.add(s7);
		Carrefour c2 = new Carrefour(coll2);
		s4.setSud(c2);
		s6.setNord(c2);
		s7.setSud(c2);
		CapteurDeVitesse capt0 = new CapteurDeVitesse(25, true, s6);
		s6.getCapteur().add(capt0);
		CapteurDePresence capt1 = new CapteurDePresence(10, true, s2);
		s2.getCapteur().add(capt1);
		CapteurDePresence capt2 = new CapteurDePresence(10, true, s3);
		s3.getCapteur().add(capt2);
		CapteurDePresence capt3 = new CapteurDePresence(10, false, s4);
		s4.getCapteur().add(capt3);
		CapteurDePresence capt4 = new CapteurDePresence(10, false, s5);
		s5.getCapteur().add(capt4);
		FeuTricolore feu1 = new FeuTricolore(true);
		feu1.setEtat(EtatFeu.ROUGE);
		s2.getSemaphore().add(feu1);
		FeuTricolore feu2 = new FeuTricolore(true);
		feu2.setEtat(EtatFeu.VERT);
		s3.getSemaphore().add(feu2);
		FeuTricolore feu3 = new FeuTricolore(false);
		feu3.setEtat(EtatFeu.ROUGE);
		s4.getSemaphore().add(feu3);
		FeuTricolore feu4 = new FeuTricolore(false);
		feu4.setEtat(EtatFeu.VERT);
		s5.getSemaphore().add(feu4);
		PanneauDeLimitation p1 = new PanneauDeLimitation(true, 5);
		s6.getSemaphore().add(p1);
		PanneauDeLimitation p2 = new PanneauDeLimitation(true, 3);
		s7.getSemaphore().add(p2);
		s4.getSemaphore().add(p2);
		RegulationCarrefour4Feux reg1 = new RegulationCarrefour4Feux();
		reg1.getSesCapteurs().add(capt1);
		reg1.getSesCapteurs().add(capt2);
		reg1.getSesCapteurs().add(capt3);
		reg1.getSesCapteurs().add(capt4);
		reg1.getSesSemaphores().add(feu1);
		reg1.getSesSemaphores().add(feu2);
		reg1.getSesSemaphores().add(feu3);
		reg1.getSesSemaphores().add(feu4);
		capt1.getSesElementsDeRegulation().add(reg1);
		capt2.getSesElementsDeRegulation().add(reg1);
		capt3.getSesElementsDeRegulation().add(reg1);
		capt4.getSesElementsDeRegulation().add(reg1);
		feu1.getSesElementsDeRegulation().add(reg1);
		feu2.getSesElementsDeRegulation().add(reg1);
		feu3.getSesElementsDeRegulation().add(reg1);
		feu4.getSesElementsDeRegulation().add(reg1);
		v1.setP(new Position(true, 0, s1));
		v2.setP(new Position(true, 0, s3));
		v3.setP(new Position(true, 0, s7));
		for(int i=0; i<100; i++) {
			Voiture.Majtemporelle();
			ElementDeRegulation.Majtemporelle();
			Semaphore.Majtemporelle();
		}
	}
}