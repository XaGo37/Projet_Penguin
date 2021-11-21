package Penguin;
import java.io.IOException;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws IOException {

        Personnage perso = new Personnage();
        Map worldMap = new Map(5, 5);

        while (perso.getXPerso() < worldMap.nblig && perso.getYPerso() < worldMap.nbcol) {
            worldMap.placer(perso.getYPerso(), perso.getXPerso(), 'J');
            worldMap.afficher();
            perso.deplacerPersonnage();
            worldMap.actualiser();

        }
    }
}

