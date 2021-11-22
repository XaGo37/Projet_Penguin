package Penguin;
import java.io.IOException;

public class Main {

    public static final String TEXT_RED = "\u001B[31m"; //print en couleur

    public static void main(String[] args)  {
    /*    char[][] lvl1 = {{'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'},
                {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'},
                {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'},
                {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'},
                {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'},
                {'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M'},
                {'M', 'J', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'E', 'M'},
                {'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M'},
                {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'},
                {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'}};*/

        Personnage perso = new Personnage();
        Map worldMap = new Map(10, 19);

        while (perso.getXPerso() < worldMap.nblig && perso.getYPerso() < worldMap.nbcol) {
            worldMap.placer(perso.getXPerso(), perso.getYPerso(), 'J');
            worldMap.afficher();
            perso.deplacerPersonnage();
            worldMap.actualiser();

        }
        System.out.println(TEXT_RED + "Vous êtes sortit");
    }
}
