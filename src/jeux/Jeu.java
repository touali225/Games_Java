package jeux;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Jeu {
    Scanner sc = new Scanner(System.in);
    Challenger challenger ;
    Defenseur defenseur;

    public void executionJeux(){

        int choixJoueurFinPartie = 0;
        int choixJoueurMenu = 0;

        do {

            if(choixJoueurFinPartie != 1) {
                choixJoueurMenu = jeuDispo();
            }

            lancerJeu(choixJoueurMenu); // a chaque fois que le jeu s'execute
            choixJoueurFinPartie = finPartie();


            System.out.println(" ");

        } while (choixJoueurFinPartie !=3);
    }

    /**
     * FIN PARTIE CHALLENGER.
     */
    public int finPartie() {
        Menu.affichageFinPartie();

        int choixJoueur = 0;
        boolean responseIsGood;
        do {
            try {
                choixJoueur = sc.nextInt();
                responseIsGood = true;
            } catch (InputMismatchException e) {
                sc.next();
                System.out.println("Merci de faire un choix svp !!!");
                responseIsGood = false;
            }
        } while (!responseIsGood);
        return choixJoueur;
    }

    public void lancerJeu(int mode) {
        switch (mode) {
            case 1:
                challenger = new Challenger();
                challenger.askChallenger();
                break;
            case 2:
                defenseur = new Defenseur();
                defenseur.askDefenseur();
                break;
            case 3:
                 Duel duel = new Duel();
                break;
        }
    }


    /**
     * LA LISTE DE JEUX DISPONIBLES
     */

    public int jeuDispo() {
        String[] Jeux = {"Challenger", "Defenseur", "Duel"};
        return jeuAlaDemande("Jeu", Jeux);
    }

    /**
     * AFFICHAGE A L'ECRAN
     */

    public int jeuAlaDemande(String mode, String[] choix) {
        System.out.println("Choix " + mode);
        for (int i = 1; i <= choix.length; i++)
            System.out.println(i + " - " + choix[i - 1]);
        System.out.println("Que souhaitez-vous comme " + mode + " ? ");
        int choixJoueur = 0;
        boolean bonneReponse;
        do {
            try {
                choixJoueur = sc.nextInt();
                bonneReponse = (choixJoueur >= 1 && choixJoueur <= choix.length);
            } catch (InputMismatchException e) {
                sc.next();
                bonneReponse = false;
            }
            boolean isVowel = "aeiouy".contains(Character.toString(mode.charAt(0)));
            if (isVowel)
                System.out.println("Vous n'avez pas choisi d'" + mode + " parmi les modes proposés");
            else
                System.out.println("Vous n'avez pas choisi de " + mode + " parmi les modes proposés");
        } while (!bonneReponse);
        return choixJoueur;
    }

    /**
     * LANCER LE JEU.
     */
    public void jeuAlaDemande() {
        int nbJeu = jeuDispo();
        lancerJeu(nbJeu);
    }

}
