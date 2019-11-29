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

        System.out.println("");
        System.out.println("SPECIFICATIONS");
        System.out.println("");
        System.out.println("L'intelligence artificielle de l’ordinateur joue le rôle de défenseur. Elle définit une combinaison de X chiffres aléatoirement.");
        System.out.println("Vous avez le rôle d’attaquant et vous devez faire une proposition d’une combinaison de X chiffres.");
        System.out.println("L'intelligence artificielle de l’ordinateur indique pour chaque chiffre de la combinaison proposée si le chiffre de sa combinaison est plus grand (+), plus petit (-) ou si c’est le bon (=).");
        System.out.println("Bonne Chance ! N'oubliez pas, Il y a un nombre limité d’essais!");
        System.out.println("");

        /**
         * ELABORATION DE LA COMBINAISON ALEATOIRE
         */


        Random random = new Random();
        List<Integer> combinaisonSecrete = new ArrayList<>();//Integer la version objet  de int creer une liste

        for (int i = 0; i <= 3; i++) {
            int nbr = random.nextInt(10);
            combinaisonSecrete.add(nbr);// ajout de la liste crée
        }

        /**
         * ELABORATION DE LA COMBINAISON DU JOUEUR
         */

        int nbTour;

        for (nbTour = 0; nbTour <= Configuration.nbreTour; nbTour++) {
            System.out.println("Merci de faire une proposition de 4 chiffres");

            //System.out.println("DSL");
            List<Integer> combinaisonJoueur = new ArrayList<>();
            String[] listTmp = sc.nextLine().split(""); //creation tableau temporaire en string
            for (String s : listTmp) {
                combinaisonJoueur.add(Integer.valueOf(s)); // conversion du string en integer
            }


            /**
             * RESULTAT FIN PARTIE
             */

            if (nbTour == 4) {
                Menu.affichageDafaite(combinaisonSecrete);
                break;
            }


            /**
             * AFFICHAGE DE LA REPONSE
             */

            //Comparer, stocker et afficher la réponse.
            ArrayList<String> Reponse = new ArrayList<>();
            for (int j = 0; j < combinaisonSecrete.size(); j++) {

                if (combinaisonSecrete.get(j) > combinaisonJoueur.get(j))
                    Reponse.add("+");
                else if (combinaisonSecrete.get(j) == combinaisonJoueur.get(j))
                    Reponse.add("=");
                else
                    Reponse.add("-");


            }
            System.out.println("Réponse = " + Reponse);
            //System.out.println("Vous auriez dû jouer cette combinaison:" + combinaisonSecrete);

            /**
             * AFFICHAGE DE LA VICTOIRE
             */

            if (combinaisonSecrete.equals(combinaisonJoueur)) {
                System.out.println("Bravo, vous avez gagné !!!");
                System.out.println("En effet, l'ordinateur avait bien joué " +combinaisonSecrete);
                break;
            } else {
                System.out.println("");
            }


        }
    }
}
