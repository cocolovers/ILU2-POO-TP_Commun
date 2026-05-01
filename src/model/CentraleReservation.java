package model;

public class CentraleReservation <E extends EntiteReservable<F>, F extends Formulaire> {
	private EntiteReservable<F>[] entites;
	private int nbEntite = 0;
		
	public CentraleReservation(EntiteReservable<F>[] entites) {
		super();
		this.entites = entites;
	}

	public int ajouterEntite(E entite) {
		entites[nbEntite] = entite;
		nbEntite++;
		entite.setNumero(nbEntite);
		return entite.getNumero();
	}
	
	public int[] donnerPossibilites(F formulaire) {
		int[] tab = new int[nbEntite];
		for (int i=0;i<nbEntite;i++) {
			if (entites[i].compatible(formulaire))
				tab[i] = entites[i].getNumero();
			else tab[i] = 0;
		}
		return tab;
	}
	
	public Reservation reserver(int numEntite, F formulaire) {
		EntiteReservable<F> entite = entites[numEntite-1];
		formulaire.setIdentificationEntite(entite.getNumero());
		
		return entite.reserver(formulaire);
	}
	
}
