package fr.karamouche.uno;

public class Carte {
	private final int numero;
	private final Couleur couleur;
	
	public Carte(int numero, Couleur couleur) {
		this.numero = numero;
		this.couleur = couleur;
	}
	
	public String getName() {
		return numero+" de "+couleur.toString().toLowerCase();
	}
	
	public int getNum() {
		return this.numero;
	}
	
	public Couleur getCouleur() {
		return this.couleur;
	}

}
