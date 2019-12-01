package jeux;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Challenger extends Mode {
    /**
     * MODE CHALLENGER
     */
    public void askChallenger() {

        Scanner sc = new Scanner(System.in);
        Menu.affichageChallenger();

        /**
         * ELABORATION DE LA COMBINAISON ALEATOIRE
         */
        List<Integer> combinaisonSecrete = Utilitaire.generationCombinaisonAleatoire();

        /**
         * ELABORATION DE LA COMBINAISON DU JOUEUR
         */

        int nbTour;

        for (nbTour = 0; nbTour <= Configuration.nbreTour; nbTour++) {
            Menu.affichageSaisieUtilisateur();
            List<Integer> combinaisonJoueur = Utilitaire.saisieUtilisateur();

            /**
             * RESULTAT FIN PARTIE
             */

            if (nbTour == Configuration.nbreTour) {
                Menu.affichageDefaite(combinaisonSecrete);
                break;
            }

            /**
             * AFFICHAGE DE LA REPONSE
             */

            //Comparer, stocker et afficher la réponse.

            ArrayList<String> reponse = new ArrayList<>();
            for (int j = 0; j < combinaisonSecrete.size(); j++) {

                if (combinaisonSecrete.get(j) > combinaisonJoueur.get(j))
                    reponse.add("+");
                else if (combinaisonSecrete.get(j) == combinaisonJoueur.get(j))
                    reponse.add("=");
                else
                    reponse.add("-");
            }

            Menu.affichageReponse(reponse);
            //System.out.println("Vous auriez dû jouer cette combinaison:" + combinaisonSecrete);

            /**
             * AFFICHAGE DE LA VICTOIRE
             */
            if (combinaisonSecrete.equals(combinaisonJoueur)) {
                Menu.affichageVictoire(combinaisonSecrete);
                break;
            } else {
                System.out.println("");
            }
        }
    }
}