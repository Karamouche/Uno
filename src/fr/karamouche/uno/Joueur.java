package fr.karamouche.uno;

import java.util.ArrayList;
import java.util.Scanner;

public class Joueur {
	private final ArrayList<Carte> jeu;
	private final Partie partie;
	private final String name;
	
	public Joueur(Partie partie, String name) {
		this.jeu = new ArrayList<Carte>();
		this.partie = partie;
		this.name = name;
	}

	public ArrayList<Carte> getJeu(){
		return this.jeu;
	}
	
	public ArrayList<Carte> getPlayableWith(Carte carte){
		ArrayList<Carte> finale = new ArrayList<Carte>();
		for(Carte carteIterate : this.getJeu()) {
			if(carteIterate.getCouleur().equals(carte.getCouleur()) || carteIterate.getNum() == carte.getNum()) {
				finale.add(carteIterate);
			}
		}
		return finale;
	}

	public void aJoue(Carte carteJoue) {
		this.getJeu().remove(carteJoue);
		partie.setCarteJeu(carteJoue);
	}
	
	@Override
	public String toString() {
		return this.name;
	}

	public void play() {
		System.out.println("\nAu tour du "+this.toString());
		System.out.println("Vous pouvez jouer");
		ArrayList<Carte> playableCards = this.getPlayableWith(partie.getCarteJeu());
		for(Carte carte : playableCards) {
			System.out.println(carte.getName());
		}
		System.out.println("Que voulez vous joueur ?");
		Scanner sc = new Scanner(System.in);
		int nCarteJoue = Integer.parseInt(sc.nextLine());
		nCarteJoue--;
		while(nCarteJoue >= playableCards.size()) {
			System.out.println("L'index n'est pas valide");
			System.out.println("Que voulez vous joueur ?");
			nCarteJoue = Integer.parseInt(sc.nextLine());
			nCarteJoue--;
		}
		sc.reset();
		sc.close();
		Carte carteJoue = playableCards.get(nCarteJoue);
		System.out.println("\nVous jouez la carte "+carteJoue.getName());
		this.aJoue(carteJoue);
		
	}
}
