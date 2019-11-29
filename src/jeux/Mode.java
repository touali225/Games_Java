package jeux;
import java.util.*;

public class Mode {

    Scanner sc = new Scanner(System.in);

    /**
     * LA LISTE DE JEUX DISPONIBLES
     */
















    /**
     * MODE DEFENSEUR
     */
    public void askDefenseur() {


        Scanner sc = new Scanner(System.in);

        System.out.println("");
        System.out.println("SPECIFICATIONS");
        System.out.println("");
        System.out.println("1- Le joueur (cette fois dans le rôle de défenseur) définit une combinaison de X chiffres aléatoirement.");
        System.out.println("2- L'intelligence artificielle de l’ordinateur doit faire une proposition d’une combinaison de X chiffres (c’est le rôle attaquant).");
        System.out.println("3- Le joueur indique pour chaque chiffre de la combinaison proposée si le chiffre de sa combinaison est plus grand (+), plus petit (-) ou si c’est le bon (=).");
        System.out.println("Bonne Chance ! N'oubliez pas, Il y a un nombre limité d’essais!");
        System.out.println("");

        System.out.println("Merci de faire une Combinaison sécrete de 4 chiffres");
        List<Integer> combinaisonJoueur = new ArrayList<>();
        String[] listTmp = sc.nextLine().split(""); //creation tableau temporaire en string
        for (String s : listTmp) {
            combinaisonJoueur.add(Integer.valueOf(s)); // conversion du string en integer
        }


        ArrayList<String> reponse = new ArrayList<>();
        List<Integer> combinaisonSecrete = Utilitaire.generationCombinaisonAleatoire();//Integer la version objet  de int creer une liste


        int nbTour;
        for (nbTour = 0; nbTour <= 4; nbTour++) {


            /**
             * VICTOIRE DU JOUEUR
             */

            if (nbTour == 4) {
                System.out.println("");
                System.out.println("Bravo, vous avez gagné !!!");
                System.out.println("L'ordinateur aurait dû jouer" + combinaisonJoueur);
                break;
            }

            for (int i = 0; i < combinaisonJoueur.size(); i++) {

                if (combinaisonJoueur.get(i) > combinaisonSecrete.get(i))
                    reponse.add("+");
                else if (combinaisonJoueur.get(i) == combinaisonSecrete.get(i))
                    reponse.add("=");
                else
                    reponse.add("-");


            }
            System.out.println("Combinaison Ordinateur" + combinaisonSecrete);
            System.out.println("Réponse = " + reponse);
            reponse.clear();

            /**
             * DEFAITE DU JOUEUR
             */

            if (combinaisonSecrete.equals(combinaisonJoueur)) {
                System.out.println("");
                System.out.println("Désolé, vous avez perdu !!!");
                System.out.println("L'ordinateur a deviné votre combinaison" +combinaisonJoueur);
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