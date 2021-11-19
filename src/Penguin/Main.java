package Penguin;
import java.util.Scanner;

public class Main {

    public static void main (String[] args) {

        Personnage perso = new Personnage();
        Map worldMap = new Map(15, 19);

        Scanner sc1 = new Scanner(System.in);

        worldMap.placer(perso.getXPerso(), perso.getYPerso(), 'J');
        worldMap.afficher();
        perso.deplacerPersonnage(4);
        worldMap.actualiser();
        worldMap.placer(perso.getXPerso(), perso.getYPerso(), 'J');
        worldMap.afficher();

    }
}
