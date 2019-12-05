package jeux;

import java.util.*;

public class Challenger extends Mode {

    List<Integer> combinaisonSecrete;
    boolean victoire;
    /**
     * MODE CHALLENGER
     */
    public void askChallenger() {

        Scanner sc = new Scanner(System.in);
        Menu.affichageChallenger();

        /**
         * ELABORATION DE LA COMBINAISON ALEATOIRE
         */
        combinaisonSecrete = Utilitaire.generationCombinaisonAleatoire();

        /**
         * AFFICHAGE DU RESULTAT DU JEU
         */

        int nbTour = Configuration.nbreTour;
        victoire=false;

        while (nbTour > 0 && !victoire) {
            tourChallenger();
             nbTour--;
        } if(victoire){
            Menu.affichageVictoire(combinaisonSecrete);
        } else {
            Menu.affichageDefaite(combinaisonSecrete);
        }





    } /**
     * SAISIE UTILISATEUR
     */
    public void tourChallenger(){
        Menu.affichageSaisieUtilisateur();
        List<Integer> combinaisonJoueur = Utilitaire.saisieUtilisateur();
        //System.out.println(combinaisonSecrete);



        /**
         * AFFICHAGE DE LA REPONSE DE L'ORDINATEUR BASEE SUR LA SAISIE DU JOUEUR
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
         * DETECTION DE LA VICTOIRE
         */
        if (combinaisonSecrete.equals(combinaisonJoueur)) {
            victoire=true;
        }
    }
}