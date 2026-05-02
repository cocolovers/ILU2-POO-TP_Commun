package interface_noyau_fonctionnel;

public class InterfaceNoyauFonctionnel {

    public String[] trouverTableDisponible(int jour, int mois, int nombrePersonnes, String time) {
        String[] tables = new String[6];
        
        switch (nombrePersonnes) {
            case 1:
                tables[0] = "Table 1";
                tables[1] = "Table 2";
                tables[2] = "Table 3";
                tables[3] = "Table 4";
                tables[4] = "Table 5";
                tables[5] = "Table 6";
                break;
            case 2:
                tables[0] = "Table 1";
                tables[1] = "Table 2";
                tables[2] = "Table 3";
                tables[3] = "Table 4";
                tables[4] = "Table 5";
                tables[5] = "Table 6";
                break;
            case 3:
                tables[0] = "Table 2";
                tables[1] = "Table 3";
                tables[2] = "Table 4";
                tables[3] = "Table 5";
                tables[4] = "Table 6";
                break;
            case 4:
                tables[0] = "Table 2";
                tables[1] = "Table 3";
                tables[2] = "Table 4";
                tables[3] = "Table 5";
                tables[4] = "Table 6";
                break;
            case 5:
                tables[0] = "Table 6";
                break;
            case 6:
                tables[0] = "Table 6"; 
                break;
            case 7:
                tables[0] = "Table 6";
                break;
            case 8:
                tables[0] = "Table 6";
                break;
            default:
                tables = null;
                break;
        }
        return tables;
    }

}
