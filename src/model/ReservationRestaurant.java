package model;

public class ReservationRestaurant extends Reservation {
	private int noService;
	private int noTable;
	
	public ReservationRestaurant(int jour, int mois,int noService, int noTable) {
		super(jour, mois);
		this.noService = noService;
		this.noTable = noTable;
	}
	
	public String toString() {
		return "Le " + jour +"/"+ mois + " : Table " + noTable +
			" pour le " + noService + "e service";
	}
}
