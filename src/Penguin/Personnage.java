package Penguin;

import java.util.Scanner;

public class Personnage {

    private String nom;
    private int xPerso;
    private int yPerso;

    public Personnage() {
        xPerso = 0;
        yPerso = 0;
    }

    //Getter
    public String getNom(){
        return this.nom;
    }
    public int getXPerso() {
        return this.xPerso;
    }
    public int getYPerso() {
        return this.yPerso;
    }

    //Setter
    public void setNom(String n) {
        this.nom = n;
    }
    public void setXPerso(int newX) {
        this.xPerso = newX;
    }
    public void setYPerso(int newY) {
        this.yPerso = newY;
    }

    public void deplacerPersonnage() {
        Scanner position = new Scanner(System.in);
        System.out.println("Enter choice :");
        char choice = position.next().charAt(0);

        if(choice == 'A'){
            this.xPerso++;
        }
        if(choice == 'B'){
            this.xPerso--;
        }
        if(choice == 'C'){
            this.yPerso++;
        }
        if(choice == 'D'){
            this.yPerso--;
        }
    }
}

