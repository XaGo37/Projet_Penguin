package Penguin;

public class Map {

    private int nblig;
    private int nbcol;
    private char[][] map;

    public Map(int lig, int col) {

        this.nblig = lig;
        this.nbcol = col;
        map = new char[lig][col];

        for (int i = 0; i < lig; i++) {
            for (int j = 0; j < col; j++) {
                map[i][j] = '\u0023';
            }
        }
    }
    public char getCase(int l, int c) {
        return map[nblig][nbcol];
    }

    public void afficher() {
        for (int i = 0; i < nblig; i++) {
            for (int j = 0; j < nbcol; j++) {
                System.out.print(" " + map[i][j]);
            }
            System.out.println();
        }
    }

    public void placer(int lig, int col, char perso) {// Test si on se trouve bien dans la grille.
        if (lig < 0 || col < 0 ||lig > nblig || col > nbcol) {
            System.out.print("Erreur de placement.");
            return;
        }
        if (map[lig][col] == '#') // Si c'est = à vide
        {
            map[lig][col] = perso;
        } else {
            System.out.print("Erreur, cet emplacement n'est pas vide.");
            return;
        }
    }
    public void actualiser() {
        for(int i = 0; i < nblig ; i++) {
            for(int j = 0 ; j < nbcol ; j++) {
                map[i][j] = ' ';
            }
        }
    }
}
//https://www.developpez.net/forums/d1315480/java/general-java/debuter-java/remplir-matrice-n-lignes-m-colonnes/