package theophile;
import java.util.*;

public class Mode {

    Scanner sc = new Scanner(System.in);
    String resumeMode = "";

    /**
     * LA LISTE DE JEUX DISPONIBLES
     */

    public int jeuDispo() {
        String[] Jeux = {"Challenger", "Defenseur", "Duel"};
        return jeuAlaDemande("Jeu", Jeux);
    }

    /**
     * LANCER LE JEU.
     */
    public void jeuAlaDemande() {
        int nbJeu = jeuDispo();
        lancerJeu(nbJeu);
    }

    public void lancerJeu(int mode) {
        switch (mode) {
            case 1:
                askChallenger();
                break;
            case 2:
                askDefenseur();
                break;
            case 3:
                Duel askDuel = new Duel();
                break;
        }
    }

    /**
     * AFFICHAGE A L'ECRAN
     */

    public int jeuAlaDemande(String category, String[] responses) {
        System.out.println("Choix " + category);
        for (int i = 1; i <= responses.length; i++)
            System.out.println(i + " - " + responses[i - 1]);
        System.out.println("Que souhaitez-vous comme" + category + "?");
        int choixJoueur = 0;
        boolean responseIsGood;
        do {
            try {
                choixJoueur = sc.nextInt();
                responseIsGood = (choixJoueur >= 1 && choixJoueur <= responses.length);
            } catch (InputMismatchException e) {
                sc.next();
                responseIsGood = false;
            }
            if (responseIsGood) {
                String choice = "Vous allez jouer au " + category + " : " + responses[choixJoueur - 1];
                resumeMode += choice + "%n";
                //System.out.println(choice);
            } else {
                boolean isVowel = "aeiouy".contains(Character.toString(category.charAt(0)));
                if (isVowel)
                    System.out.println("Vous n'avez pas choisi d'" + category + " parmi les modes proposés");
                else
                    System.out.println("Vous n'avez pas choisi de " + category + " parmi les modes proposés");
            }
        } while (!responseIsGood);
        return choixJoueur;
    }

    /**
     * FIN PARTIE CHALLENGER.
     */
    public int finPartie() {
        System.out.println("");
        System.out.println(".............................................................................................................................");
        System.out.println("Que souhaitez - vous ?");
        System.out.println("1 - Rejouer une nouvelle partie ?");
        System.out.println("2 - Lancer un nouveau mode ?");
        System.out.println("3 - Sortir?");

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

        for (int i = 0; i <= 4; i++) {
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

            if (i == 4) {
                System.out.println("Désolé, vous avez perdu !!!");
                //System.out.println("Vous auriez dû jouer" + combinaisonSecrete);
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
                break;
            } else {
                System.out.println("");
            }


        }
    }

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

        Random random = new Random();
        ArrayList<String> reponse = new ArrayList<>();
        List<Integer> combinaisonSecrete = new ArrayList<>();//Integer la version objet  de int creer une liste
        for (int j = 0; j <= 3; j++) {
            int nbr = random.nextInt(10);
            combinaisonSecrete.add(nbr);// ajout de la liste crée
        }

        for (int k = 0; k <= 4; k++) {


            /**
             * VICTOIRE DU JOUEUR
             */

            if (k == 4) {
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