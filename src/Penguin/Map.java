package Penguin;

public class Map {

    public int nblig;
    public int nbcol;
    private char[][] map =  {{'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'},
        {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'},
        {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'},
        {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'},
        {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'},
        {'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M'},
        {'M', 'J', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'E', 'M'},
        {'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M'},
        {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'},
        {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'}};
    char tmp_tab[][];

    public Map(int lig, int col) { // Constructeur

        this.nblig = lig;
        this.nbcol = col;
        tmp_tab = new char[lig][col];

    /*    for (int i = 0; i < lig; i++) {
            for (int j = 0; j < col; j++) {
                map[i][j] = m[i][j];
            }
        }*/

        tmp_tab = new char[lig][col];
    }
    public char getCase(int l, int c) {
        return map[nblig][nbcol];
    }

    public void afficher() {
        for (int i = 0; i < nblig; i++) {
            for (int j = 0; j < nbcol; j++) {
                System.out.print(map[i][j]);
                tmp_tab[i][j] = map[i][j];
            }
            System.out.println();
        }
    }
    public void placer(int lig, int col, char perso) {// Test si on se trouve bien dans la grille.
        if (lig < 0 || col < 0 || lig > nblig-1 || col > nbcol-1) {
            System.out.print("Erreur de placement.");
            return;
        }

        if (map[lig][col] == 'o') // Si c'est = à vide
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
                map[i][j] = tmp_tab[i][j];
            }
        }
    }
}
//https://www.developpez.net/forums/d1315480/java/general-java/debuter-java/remplir-matrice-n-lignes-m-colonnes/