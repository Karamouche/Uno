package fr.karamouche.uno;

import java.util.ArrayList;

public class Partie {
	private final ArrayList<Carte> pioche;
	private Carte carteJeu;
	
	public Partie(ArrayList<Carte> pioche) {
		this.pioche = pioche;
		this.carteJeu = null;
	}
	
	public void piocheCarte(Joueur joueur) {
		Carte aPiocher = this.pioche.get(0);
		this.pioche.remove(aPiocher);
		joueur.getJeu().add(aPiocher);
	}
	
	public void retournerCarte() {
		Carte aRetourner = this.pioche.get(0);
		this.pioche.remove(aRetourner);
		this.setCarteJeu(aRetourner);
	}
	
	public ArrayList<Carte> getPioche(){
		return this.pioche;
	}
	
	public Carte getCarteJeu() {
		return this.carteJeu;
	}
	
	public void setCarteJeu(Carte carteJeu) {
		this.carteJeu = carteJeu;
	}
	
}
