package model;

public class Restaurant implements IEtablissement<FormulaireRestaurant> {

	@Override
	public int donnerPossibilites(FormulaireRestaurant F) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Reservation reserver(int numEntite, FormulaireRestaurant F) {
		// TODO Auto-generated method stub
		return null;
	}

	private static class Table extends EntiteReservable<FormulaireRestaurant> {
		private int nbChaises;
		private CalendrierAnnuel calendrierDeuxiemeService;

		private Table(int nbChaises) {
			super();
			this.nbChaises = nbChaises;
		}

		@Override
		public boolean compatible(FormulaireRestaurant formulaire) {
			if (formulaire.getNombrePersonnes())
			return false;
		}

		@Override
		public Reservation reserver(FormulaireRestaurant formulaire) {
			// TODO Auto-generated method stub
			return null;
		}

	}

}
