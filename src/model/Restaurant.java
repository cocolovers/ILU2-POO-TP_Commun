package model;

public class Restaurant implements IEtablissement<FormulaireRestaurant> {

	private Table[] tables = new Table[10];
	private CentraleReservation<Table, FormulaireRestaurant> centraleReservation = new CentraleReservation<Restaurant.Table, FormulaireRestaurant>(tables);
	@Override
	public int[] donnerPossibilites(FormulaireRestaurant F) {
		return centraleReservation.donnerPossibilites(F);
	}

	@Override
	public Reservation reserver(int numEntite, FormulaireRestaurant F) {
		return centraleReservation.reserver(numEntite, F);
	}
	
	public void ajouterTable(int nbChaises) {
		Table table = new Table(nbChaises);
		centraleReservation.ajouterEntite(table);
	}

	private static class Table extends EntiteReservable<FormulaireRestaurant> {
		private int nbChaises;
		private CalendrierAnnuel calendrierDeuxiemeService = new CalendrierAnnuel();

		private Table(int nbChaises) {
			super();
			this.nbChaises = nbChaises;
		}

		@Override
		public boolean compatible(FormulaireRestaurant formulaire) {
			if (formulaire.getNumService() == 1) {
				if ((formulaire.getNombrePersonnes() == nbChaises || formulaire.getNombrePersonnes() == nbChaises -1) && 
						calendrier.estLibre(formulaire.getJour(),formulaire.getMois()))
					return true;
			} else if (formulaire.getNumService() == 2) {
				if ((formulaire.getNombrePersonnes() == nbChaises || formulaire.getNombrePersonnes() == nbChaises -1) && 
						calendrierDeuxiemeService.estLibre(formulaire.getJour(),formulaire.getMois()))
					return true;
			}
			return false;
		}

		@Override
		public Reservation reserver(FormulaireRestaurant formulaire) {
			if (formulaire.getNumService() == 1) {
				calendrier.reserver(formulaire.getJour(), formulaire.getMois());
			} else if (formulaire.getNumService() == 2) {
				calendrierDeuxiemeService.reserver(formulaire.getJour(), formulaire.getMois());
			}
			Reservation reservation = new ReservationRestaurant(formulaire.getJour(),formulaire.getMois(),
					formulaire.getNumService(),getNumero());
			return reservation;
		}

	}

}
