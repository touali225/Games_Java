package jeux;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Defenseur extends Mode {

    public void askDefenseur() {

        Scanner sc = new Scanner(System.in);
        Menu.affichageDefenseur();

        /**
         * SAISIE DE LA COMBINAISON DU JOUEUR
         */

        Menu.affichageSaisieUtilisateur();
        List<Integer> combinaisonJoueur = Utilitaire.saisieUtilisateur();

        /**
         * ELABORATION DE LA COMBINAISON ALEATOIRE
         */
        ArrayList<String> reponse = new ArrayList<>();
        List<Integer> combinaisonSecrete = Utilitaire.generationCombinaisonAleatoire();//Integer la version objet  de int creer une liste

        int nbTour;

        for (nbTour = 0; nbTour <= Configuration.nbreTour; nbTour++) {

            /**
             * VICTOIRE DU JOUEUR
             */

            if (nbTour == Configuration.nbreTour) {
                Menu.affichageVictoireDefenseur(combinaisonJoueur);
                break;
            }

            /**
             * LES REPONSES
             */

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
             * DEFAITE DU JOUEUR
             */

            if (combinaisonSecrete.equals(combinaisonJoueur)) {
                Menu.affichageDefaiteDefenseur(combinaisonJoueur);
                break;
            }


            /**
             *  MODIFICATION DE LA PROPOSITION BASEE SUR LES CONSIGNES DU JOUEUR
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
}