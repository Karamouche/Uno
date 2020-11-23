package fr.karamouche.uno;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		ArrayList<Carte> jeu = new ArrayList<Carte>();
		for(Couleur couleur : Couleur.values()) {
			for(int i = 0 ; i <= 9 ; i++) {
				jeu.add(new Carte(i, couleur));
				jeu.add(new Carte(i, couleur));
			}
		}
		Collections.shuffle(jeu);
		Partie partie = new Partie(jeu);
		
		//ON DECLARE LES JOUEURS
		Joueur joueur1 = new Joueur(partie, "joueur 1");
		Joueur joueur2 = new Joueur(partie, "joueur 2");
		for(int j = 0 ; j < 7 ; j++) {
			partie.piocheCarte(joueur1);
			partie.piocheCarte(joueur2);
		}
		
		System.out.println("Le joueur 1 a ces cartes : ");
		for(Carte carte : joueur1.getJeu()) {
			System.out.println(carte.getName());
		}
		
		System.out.println("\nLe joueur 2 a ces cartes : ");
		for(Carte carte : joueur2.getJeu()) {
			System.out.println(carte.getName());
		}
		
		partie.retournerCarte();
		
		System.out.println("\nLa carte en jeu : ");
		System.out.println(partie.getCarteJeu().getName());
		
		joueur1.play();
		joueur2.play();
		
	}

}
