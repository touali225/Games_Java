package theophile;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int choixJoueur;
        Mode mode = new Mode();
        do {

            mode.jeuAlaDemande();
            choixJoueur = mode.finPartie();
            System.out.println(" Le choix du jouer" +choixJoueur);
        } while (choixJoueur !=3);



    }

}