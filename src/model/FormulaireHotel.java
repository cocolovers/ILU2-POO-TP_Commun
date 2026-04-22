package model;

public class FormulaireHotel extends Formulaire {
	private int nbLitSimple;
	private int nbLitDouble;
	
	public FormulaireHotel(int jour,int mois, int nbSimple, int nbDouble) {
		super(jour, mois);
		this.nbLitDouble = nbDouble;
		this.nbLitSimple = nbSimple;
	}

	public int getNbLitSimple() {
		return nbLitSimple;
	}

	public int getNbLitDouble() {
		return nbLitDouble;
	}
}
