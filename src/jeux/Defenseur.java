package jeux;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Defenseur extends Mode {
    List<Integer> combinaisonSecrete;
    List<Integer> combinaisonJoueur;
    ArrayList reponse;
    boolean victoire;

    public void askDefenseur() {

        Scanner sc = new Scanner(System.in);
        Menu.affichageDefenseur();


        /**
         * SAISIE DE LA COMBINAISON DU JOUEUR
         */

        Menu.affichageSaisieUtilisateur();
        combinaisonJoueur = Utilitaire.saisieUtilisateur();
        //System.out.println(combinaisonJoueur);


        /**
         * ELABORATION DE LA COMBINAISON ALEATOIRE DE L'ORDINATEUR
         */
        reponse = new ArrayList<>();
        combinaisonSecrete = Utilitaire.generationCombinaisonAleatoire();//Integer la version objet  de int creer une liste
        //System.out.println(combinaisonSecrete);



        int nbTour = Configuration.nbreTour;
        while (nbTour > 0 && !victoire) {
            tourDefenseur();
            nbTour--;

        }

        /**
         * DETECTION DU RESULTAT DU JEU
         */

        if (victoire) {
            Menu.affichageDefaiteDefenseur(combinaisonJoueur);
        } else {
            Menu.affichageVictoireDefenseur(combinaisonJoueur);
        }
    }
    public void tourDefenseur(){

        /**
         * LES REPONSES DU JOUEUR BASEE SUR LA COMBINAISON DE L'ORDINATEUR
         */
        ArrayList<String> reponse = new ArrayList<>();
        for (int i = 0; i < combinaisonJoueur.size(); i++) {

            if (combinaisonJoueur.get(i) > combinaisonSecrete.get(i))
                reponse.add("+");
            else if (combinaisonJoueur.get(i) == combinaisonSecrete.get(i))
                reponse.add("=");
            else
                reponse.add("-");
        }
        System.out.println("Combinaison Ordinateur" + combinaisonSecrete);
        Menu.affichageReponse(reponse);
        reponse.clear();


        /**
         *  MODIFICATION DE LA PROPOSITION L'ORDINATEUR BASEE SUR LES CONSIGNES DU JOUEUR
         *
         */
        for (int i = 0; i <= 3; i++) {

            int a = combinaisonSecrete.get(i);
            if (combinaisonSecrete.get(i) > combinaisonJoueur.get(i)) {
                a--;
                combinaisonSecrete.set(i, a);
            } else if (combinaisonSecrete.get(i) == combinaisonJoueur.get(i)) {
            } else {
                a++;
                combinaisonSecrete.set(i, a);

            }

        }
    }

    }

