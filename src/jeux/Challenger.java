package jeux;

import java.util.*;

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

        int nbTour = Configuration.nbreTour;
        boolean victoire=false;
        //nbTour <= Configuration.nbreTour; nbTour++)
        while (nbTour > 0 && !victoire) {
            Menu.affichageSaisieUtilisateur();
            List<Integer> combinaisonJoueur = Utilitaire.saisieUtilisateur();

//            boolean bonneReponse;
//            do {
//                try {
//                    combinaisonJoueur= sc.nextInt();
//                    bonneReponse = true;
//                } catch (InputMismatchException e) {
//                    sc.next();
//                    System.out.println("Merci de faire une proposition de 4 chiffres");
//                    bonneReponse = false;
//                }
//                boolean isVowel = "aeiouy".contains(Character.toString(mode.charAt(0)));
//                if (isVowel)
//                    System.out.println("Vous n'avez pas choisi une combinaison de 4 chiffres");
//                else
//                    System.out.println("Vous n'avez pas choisi une combinaison de 4 chiffres");
//            } while (!bonneReponse);
//            return combinaisonJoueur;

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