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
        switch (nbJeu) {
            case 1:
                askChallenger(true);
                break;
            case 2:
                askChallenger(true);
                break;
            case 3:
                askChallenger(false);

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
        int nbResponse = 0;
        boolean responseIsGood;
        do {
            try {
                nbResponse = sc.nextInt();
                responseIsGood = (nbResponse >= 1 && nbResponse <= responses.length);
            } catch (InputMismatchException e) {
                sc.next();
                responseIsGood = false;
            }
            if (responseIsGood) {
                String choice = "Vous allez jouer au " + category + " : " + responses[nbResponse - 1];
                resumeMode += choice + "%n";
                System.out.println(choice);
            } else {
                boolean isVowel = "aeiouy".contains(Character.toString(category.charAt(0)));
                if (isVowel)
                    System.out.println("Vous n'avez pas choisi d'" + category + " parmi les modes proposés");
                else
                    System.out.println("Vous n'avez pas choisi de " + category + " parmi les modes proposés");
            }
        } while (!responseIsGood);
        return nbResponse;
    }


    /**
     * MODE CHALLENGER
     */
    public void askChallenger(boolean allSidesEnable) {

        Scanner sc = new Scanner(System.in);

        System.out.println("");
        System.out.println("SPECIFICATIONS");
        System.out.println("");
        System.out.println("L'intelligence artificielle de l’ordinateur joue le rôle de défenseur. Elle définit une combinaison de X chiffres aléatoirement.");
        System.out.println("Vous avez le rôle d’attaquant et vous devez faire une proposition d’une combinaison de X chiffres.");
        System.out.println("L'intelligence artificielle de l’ordinateur indique pour chaque chiffre de la combinaison proposée si le chiffre de sa combinaison est plus grand (+), plus petit (-) ou si c’est le bon (=).");
        System.out.println("Bonne Chance ! N'oubliez pas, Il y a un nombre limité d’essais!");
        System.out.println("");

        Random random = new Random();
        List<Integer> combinaisonSecrete = new ArrayList<>();//Integer la version objet  de int creer une liste

        for (int i = 0; i <= 3; i++) {
            int nbr = random.nextInt(10);
            combinaisonSecrete.add(nbr);// ajout de la liste crée
        }

        for (int i = 0; i <= 4; i++) {
            System.out.println("Merci de faire une proposition de 4 chiffres");
            List<Integer> combinaisonJoueur = new ArrayList<>();
            String[] listTmp = sc.nextLine().split(""); //creation tableau temporaire en string
            for (String s : listTmp) {
                combinaisonJoueur.add(Integer.valueOf(s)); // conversion du string en integer
            }

            //Comparer, stocker et afficher la réponse.
            ArrayList<String> Reponse = new ArrayList<>();
            for (int j = 0; j < combinaisonSecrete.size(); j++) {

                if (combinaisonSecrete.get(j) > combinaisonJoueur.get(j))
                    Reponse.add("+");
                else if (combinaisonSecrete.get(j) == combinaisonJoueur.get(j))
                    Reponse.add("=");
                else
                    Reponse.add("-");


            } System.out.println("Réponse = " + Reponse);


            if (combinaisonSecrete == combinaisonJoueur) {
                System.out.println("Bravo, vous avez gagné !!!");
                break;
            }

                if ( i>= 5) {
                    break;
                }
            }

        System.out.println("Désolé, vous avez perdu !!!");
        System.out.println("Vous auriez dû jouer cette combinaison:" +combinaisonSecrete);




        }


    }