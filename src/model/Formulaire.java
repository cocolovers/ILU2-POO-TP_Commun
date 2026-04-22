package model;

public abstract class Formulaire {
	private int jour;
	private int mois;
	private int numero;
	
	public Formulaire(int jour, int mois) {
		super();
		this.jour = jour;
		this.mois = mois;
	}

	public int getJour() {
		return jour;
	}

	public int getMois() {
		return mois;
	}

	public int getIdentificationEntite() {
		return numero;
	}

	public void setIdentificationEntite(int numero) {
		this.numero = numero;
	}
	
}
