package jeux;

import java.util.*;

public class Challenger extends Mode {

    List<Integer> combinaisonSecrete;
    boolean victoire;

    public Challenger(){

        Menu.affichageChallenger();

        /**
         * ELABORATION DE LA COMBINAISON ALEATOIRE
         */
        combinaisonSecrete = Utilitaire.generationCombinaisonAleatoire();

    }
    /**
     * MODE CHALLENGER
     */
    public void askChallenger() {

        if (Configuration.modeDev){
            System.out.println(" Mode dev activé ! La combinaison secrète de l'ordinateur " +combinaisonSecrete);
        }

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
    public boolean tourChallenger(){
        Menu.affichageSaisieUtilisateur();
        List<Integer> combinaisonJoueur = Utilitaire.saisieUtilisateur();

        /**
         * AFFICHAGE DE LA REPONSE DE L'ORDINATEUR BASEE SUR LA SAISIE DU JOUEUR
         */

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

        /**
         * DETECTION DE LA VICTOIRE
         */
        if (combinaisonSecrete.equals(combinaisonJoueur)) {
            victoire=true;
        }
        return victoire;
    }
}