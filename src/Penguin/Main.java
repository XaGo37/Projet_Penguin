package Penguin;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Personnage perso = new Personnage();
        Map worldMap = new Map(15, 19);

        while (perso.getXPerso() < worldMap.nblig && perso.getYPerso() < worldMap.nbcol) {
            worldMap.placer(perso.getYPerso(), perso.getXPerso(), 'J');
            worldMap.afficher();
            perso.deplacerPersonnage();
            worldMap.actualiser();

        }
    }
}

