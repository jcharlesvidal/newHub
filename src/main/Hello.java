package main;

public class Hello {
	private String nom;

	public Hello(String nom) {
		super();
		this.nom = nom;
	}
	public String JeMappelle() {
		return "Je m'appelle "+nom;
	}
}
