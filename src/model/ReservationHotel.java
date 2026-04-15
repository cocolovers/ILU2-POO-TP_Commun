package model;

public class ReservationHotel extends Reservation {
	int nbLitSimple;
	int nbLitDouble;
	int nbChambre;
	
	public ReservationHotel(int jour,int mois, int nbLitSimple,int nbLitDouble,int nbChambre) {
		super(jour,mois);
		this.nbLitSimple = nbLitSimple;
		this.nbLitDouble = nbLitDouble;
		this.nbChambre = nbChambre;
	}
}
