package model;

public class ReservationHotel extends Reservation {
	int nbLitSimple;
	int nbLitDouble;
	int noChambre;
	
	public ReservationHotel(int jour,int mois, int nbLitSimple,int nbLitDouble,int nbChambre) {
		super(jour,mois);
		this.nbLitSimple = nbLitSimple;
		this.nbLitDouble = nbLitDouble;
		this.noChambre = nbChambre;
	}

	@Override
	public String toString() {
		return "Le " + jour +"/"+ mois + " : " + nbLitSimple + " lits simples et "
				+ nbLitDouble + " lits doubles au chambre no " + noChambre;
	}
	
}
