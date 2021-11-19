package Penguin;

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

    public void deplacerPersonnage(int direction) {
        switch(direction) {
            case 1:// Haut
                this.xPerso++;
                break;
            case 2:// Bas
                this.xPerso--;
                break;
            case 3:// Gauche
                this.yPerso++;
                break;
            case 4:// Droite
                this.yPerso--;
                break;
            default:
                System.out.println("Ceci n'est pas une direction valide.");
        }
    }

}

