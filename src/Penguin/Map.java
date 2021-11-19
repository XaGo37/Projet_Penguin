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
    public void afficher() {
        for (int i = 0; i < nblig; i++) {
            for (int j = 0; j < nbcol; j++) {
                System.out.print(" " + map[i][j]);
            }
            System.out.println();
        }
    }

    public void level1() {

    }
}
//https://www.developpez.net/forums/d1315480/java/general-java/debuter-java/remplir-matrice-n-lignes-m-colonnes/