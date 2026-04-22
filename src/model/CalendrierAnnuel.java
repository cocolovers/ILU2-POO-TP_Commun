package model;

public class CalendrierAnnuel {
	private Mois[] calendrier = new Mois[12];
	
	public CalendrierAnnuel() {
		calendrier[0] = new Mois("Janvier",32);
		calendrier[1] = new Mois("Fevrier",29);
		calendrier[2] = new Mois("Mars",32);
		calendrier[3] = new Mois("Avril",31);
		calendrier[4] = new Mois("Mai",30);
		calendrier[5] = new Mois("Juin",31);
		calendrier[6] = new Mois("Juillet",32);
		calendrier[7] = new Mois("Aout",32);
		calendrier[8] = new Mois("Septembre",31);
		calendrier[9] = new Mois("Octobre",32);
		calendrier[10] = new Mois("Novembre",31);
		calendrier[11] = new Mois("Decembre",32);
		}
	
	public boolean estLibre(int jour, int mois) {
		return calendrier[mois-1].estLibre(jour);
	}
	
	public boolean reserver(int jour,int mois) {
		if (estLibre(jour, mois)) {
			calendrier[mois-1].reserver(jour);
			return true;
		}
		return false;
	}
	
	private static class Mois{
		private String nom;
		private boolean[] jours;
		
		private Mois(String nom, int nbJours) {
			this.nom = nom;
			this.jours = new boolean[nbJours];
			for (int i=0;i<nbJours;i++)
				jours[i] = true;
		}
		
		private boolean estLibre(int jour) {
			return jours[jour];
		}
		
		private void reserver(int jour) {
			if (!estLibre(jour))
				throw new IllegalStateException("Le jour n'est pas disponible");
			this.jours[jour] = false;
		}
	}
	

	
}
