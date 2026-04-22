package model;

public class FormulaireRestaurant extends Formulaire{
	private int nbPers;
	private int nbService;
	
	public FormulaireRestaurant(int jour, int mois, int nbPers, int noService) {
		super(jour, mois);
		this.nbPers = nbPers;
		this.nbService = noService;
	}

	
	public int getNombrePersonnes() {
		return nbPers;
	}

	public int getNumService() {
		return nbService;
	}


}
