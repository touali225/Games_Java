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
        List<Integer> combinaisonSecrete = new ArrayList<>();//Integer la version objet  de int creer une liste
        for (int j = 0; j <= 3; j++) {
        int nbr = random.nextInt(10);
        combinaisonSecrete.add(nbr);// ajout de la liste crée
        }

        for (int i = 1; i <= 4; i++) {

            //Comparer, stocker et afficher la réponse.
            ArrayList<String> Reponse = new ArrayList<>();
            for (int j = 0; j < combinaisonJoueur.size(); j++) {

                if (combinaisonJoueur.get(j) > combinaisonSecrete.get(j))
                    Reponse.add("+");
                else if (combinaisonJoueur.get(j) == combinaisonSecrete.get(j))
                    Reponse.add("=");
                else
                    Reponse.add("-");


            }
            System.out.println("");
            System.out.println("Combinaison Ordinateur" + combinaisonSecrete);
            System.out.println("Réponse = " + Reponse);


            /**
             *  Nouvelle proposition de l'ordinateur basée sur la reponse du joueur
             *
             */

            List<Integer> proprosition2 = new ArrayList<>();//Integer la version objet  de int creer une liste

            for (i = 1; i <= 1; i++) {
                ArrayList<String> affichage2 = new ArrayList<>();
                int a = combinaisonSecrete.get(0);

                if (combinaisonSecrete.get(0) > combinaisonJoueur.get(0)) {
                    a--;
                    proprosition2.add(a);
                    affichage2.add("-");
                } else if (combinaisonSecrete.get(0) == combinaisonJoueur.get(0)) {
                    proprosition2.add(a);
                    affichage2.add("=");
                } else {
                    a++;
                    proprosition2.add(a);
                    affichage2.add("+");
                }

                int b = combinaisonSecrete.get(1);

                if (combinaisonSecrete.get(1) > combinaisonJoueur.get(1)) {
                    b--;
                    proprosition2.add(b);
                    affichage2.add("-");
                } else if (combinaisonSecrete.get(1)== combinaisonJoueur.get(1)) {
                    proprosition2.add(b);
                    affichage2.add("=");
                } else {
                    b++;
                    proprosition2.add(b);
                    affichage2.add("+");
                }

                int c = combinaisonSecrete.get(2);

                if (combinaisonSecrete.get(2) > combinaisonJoueur.get(2)) {
                    c--;
                    proprosition2.add(c);
                    affichage2.add("-");
                } else if (combinaisonSecrete.get(2) == combinaisonJoueur.get(2)) {
                    proprosition2.add(c);
                    affichage2.add("=");
                } else {
                    c++;
                    proprosition2.add(c);
                    affichage2.add("+");
                }

                int d = combinaisonSecrete.get(3);

                if (combinaisonSecrete.get(3) > combinaisonJoueur.get(3)) {
                    d--;
                    proprosition2.add(d);
                    affichage2.add("-");
                } else if (combinaisonSecrete.get(3) == combinaisonJoueur.get(3)) {
                    proprosition2.add(d);
                    affichage2.add("=");
                } else {
                    d++;
                    proprosition2.add(d);
                    affichage2.add("+");
                }
                System.out.println("Deuxième proposition" + proprosition2);
                System.out.println("Réponse = " + affichage2);

            }

            List<Integer> proprosition3 = new ArrayList<>();//Integer la version objet  de int creer une liste
            for (i = 2; i <= 2; i++) {
                ArrayList<String> affichage3 = new ArrayList<>();

                int a = proprosition2.get(0);

                if (proprosition2.get(0) > combinaisonJoueur.get(0)) {
                    a--;
                    proprosition3.add(a);
                    affichage3.add("-");
                } else if (proprosition2.get(0) == combinaisonJoueur.get(0)) {
                    proprosition3.add(a);
                    affichage3.add("=");
                } else {
                    a++;
                    proprosition3.add(a);
                    affichage3.add("+");
                }

                int b = proprosition2.get(1);

                if (proprosition2.get(1) > combinaisonJoueur.get(1)) {
                    b--;
                    proprosition3.add(b);
                    affichage3.add("-");
                } else if (proprosition2.get(1) == combinaisonJoueur.get(1)) {
                    proprosition3.add(b);
                    affichage3.add("=");
                } else {
                    b++;
                    proprosition3.add(b);
                    affichage3.add("+");
                }

                int c = proprosition2.get(2);

                if (proprosition2.get(2) > combinaisonJoueur.get(2)) {
                    c--;
                    proprosition3.add(c);
                    affichage3.add("-");
                } else if (proprosition2.get(2) == combinaisonJoueur.get(2)) {
                    proprosition3.add(c);
                    affichage3.add("=");
                } else {
                    c++;
                    proprosition3.add(c);
                    affichage3.add("+");
                }

                int d = proprosition2.get(3);

                if (proprosition2.get(3) > combinaisonJoueur.get(3)) {
                    d--;
                    proprosition3.add(d);
                    affichage3.add("-");
                } else if (proprosition2.get(3) == combinaisonJoueur.get(3)) {
                    proprosition3.add(d);
                    affichage3.add("=");
                } else {
                    d++;
                    proprosition3.add(d);
                    affichage3.add("+");
                }
                System.out.println("Troisième proposition" + proprosition3);
                System.out.println("Réponse = " + affichage3);


            }

            List<Integer> proprosition4 = new ArrayList<>();//Integer la version objet  de int creer une liste
            for (i= 3; i <= 3; i++) {
                ArrayList<String> affichage4 = new ArrayList<>();

                int a = proprosition3.get(0);

                if (proprosition3.get(0) > combinaisonJoueur.get(0)) {
                    a--;
                    proprosition4.add(a);
                    affichage4.add("-");
                } else if (proprosition3.get(0) == combinaisonJoueur.get(0)) {
                    proprosition4.add(a);
                    affichage4.add("=");
                } else {
                    a++;
                    proprosition4.add(a);
                    affichage4.add("+");
                }

                int b = proprosition3.get(1);

                if (proprosition3.get(1) > combinaisonJoueur.get(1)) {
                    b--;
                    proprosition4.add(b);
                    affichage4.add("-");
                } else if (proprosition3.get(1) == combinaisonJoueur.get(1)) {
                    proprosition4.add(b);
                    affichage4.add("=");
                } else {
                    b++;
                    proprosition4.add(b);
                    affichage4.add("+");
                }

                int c = proprosition3.get(2);

                if (proprosition3.get(2) > combinaisonJoueur.get(2)) {
                    c--;
                    proprosition4.add(c);
                    affichage4.add("-");
                } else if (proprosition3.get(2) == combinaisonJoueur.get(2)) {
                    proprosition4.add(c);
                    affichage4.add("=");
                } else {
                    c++;
                    proprosition4.add(c);
                    affichage4.add("+");
                }

                int d = proprosition3.get(3);

                if (proprosition3.get(3) > combinaisonJoueur.get(3)) {
                    d--;
                    proprosition4.add(d);
                    affichage4.add("-");
                } else if (proprosition3.get(3) == combinaisonJoueur.get(3)) {
                    proprosition4.add(d);
                    affichage4.add("=");
                } else {
                    d++;
                    proprosition4.add(d);
                    affichage4.add("+");
                }
                System.out.println("Quatrième proposition" + proprosition4);
                System.out.println("Réponse = " + affichage4);

            }

            if (combinaisonSecrete.equals(combinaisonJoueur)) {
                System.out.println("Bravo, vous avez gagné !!!");
                break;
            } else if (proprosition2.equals(combinaisonJoueur)) {
                    System.out.println("Bravo, vous avez gagné !!!");
                    break;
                }
            else if (proprosition3.equals(combinaisonJoueur)) {
                System.out.println("Bravo, vous avez gagné !!!");
                break;
            }
            else if (proprosition4.equals(combinaisonJoueur)) {
                System.out.println("Bravo, vous avez gagné !!!");
                break;
            }
            else {
                    System.out.println("");
            }


            if ((proprosition4 !=(combinaisonJoueur))) {
                System.out.println("");
                System.out.println("Désolé, vous avez perdu !!!");
                System.out.println("Vous auriez dû jouer" + combinaisonJoueur);
                break;
            }


            }

        }

    }
