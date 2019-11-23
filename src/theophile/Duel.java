package theophile;

import java.util.*;

public class Duel {

    private List<Integer> combinaisonJoueur;
    private List<Integer> combinaisonOrdinateur;
    private List<Integer> propositionJoueur;
    private List<Integer> propositionOrdinateur;
    private ArrayList<String> reponseJoueur;
    private ArrayList<String> reponseOrdinateur;
    private boolean agagne;

    // choix des joueurs

    public void choixOrdinateur() {

        Random random = new Random();
        for (int i = 0; i <= 3; i++) {
            int nbr = random.nextInt(10);
            combinaisonOrdinateur.add(nbr);// ajout de la liste crée
        }
        System.out.println("Le choix de l'ordinateur : " + combinaisonOrdinateur);
    }

    public void choixJoueur() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Choisir une combinaison secrète de 4 chiffres");
        String[] listTmp = sc.nextLine().split(""); //creation tableau temporaire en string
        for (String s : listTmp) {
            combinaisonJoueur.add(Integer.valueOf(s)); // conversion du string en integer
        }

        System.out.println(" Le choix du joueur  : " + combinaisonJoueur);


    }



    public void afficherChoix() {

        for (int i = 0; i < combinaisonJoueur.size(); i++) {

            if (combinaisonJoueur.get(i) > combinaisonOrdinateur.get(i)) {
                reponseJoueur.add("+");
                reponseOrdinateur.add("-");
            } else if (combinaisonJoueur.get(i) == combinaisonOrdinateur.get(i)) {
                reponseJoueur.add("=");
                reponseOrdinateur.add("=");
            } else {
                reponseJoueur.add("-");
                reponseOrdinateur.add("+");
            }

        }

        System.out.println("*****************************************************************************************************************************************************************");
        System.out.println("La combinaison secrète de l'ordinateur est : " + combinaisonOrdinateur);
        System.out.println("La combinaison secrète du joueur est : " + combinaisonJoueur);
        System.out.println("Les indices donnés par l'Ordinateur = " + reponseOrdinateur);
        System.out.println("Les indices donnés par le Joueur = " + reponseJoueur);
        reponseOrdinateur.clear();
        reponseJoueur.clear();
        System.out.println("*****************************************************************************************************************************************************************");

        for ( int i = 0 ; i<=1 ; i++) {
            if (combinaisonOrdinateur.equals(combinaisonJoueur))
                System.out.println(" Oups  !");
            break;
        }
        finPartie();
    }

    public void aVosJeux() {
        Random random = new Random();
        for (int i = 0; i <= 3; i++) {
            int nbr = random.nextInt(10);
            propositionOrdinateur.add(nbr);// ajout de la liste crée
        }

        while ((combinaisonOrdinateur != combinaisonJoueur) && ((propositionJoueur != propositionOrdinateur))) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Faites une proposition de 4 chiffres");
            String[] listTmp = sc.nextLine().split(""); //creation tableau temporaire en string
            for (String s : listTmp) {
                propositionJoueur.add(Integer.valueOf(s)); // conversion du string en integer
            }

            for (int i = 0; i <= 3; i++) {


                int a = propositionOrdinateur.get(i);
                if (propositionOrdinateur.get(i) > combinaisonJoueur.get(i)) {
                    a--;
                    propositionOrdinateur.set(i, a);
                } else if (propositionOrdinateur.get(i) == combinaisonJoueur.get(i)) {
                } else {
                    a++;
                    propositionOrdinateur.set(i, a);
                }
            }

            for (int i = 0; i < combinaisonOrdinateur.size(); i++) {

                if (propositionJoueur.get(i) > combinaisonOrdinateur.get(i)) {
                    reponseOrdinateur.add("-");
                } else if (propositionJoueur.get(i) == combinaisonOrdinateur.get(i)) {
                    reponseOrdinateur.add("=");
                } else {
                    reponseOrdinateur.add("+");
                }
            }
            for (int i = 0; i < combinaisonJoueur.size(); i++) {

                if (propositionOrdinateur.get(i) > combinaisonJoueur.get(i)) {
                    reponseJoueur.add("-");
                } else if (propositionOrdinateur.get(i) == combinaisonJoueur.get(i)) {
                    reponseJoueur.add("=");
                } else {
                    reponseJoueur.add("+");
                }
            }
            System.out.println("*****************************************************************************************************************************************************************");
            System.out.println("La proposition de l'ordinateur est : " + propositionOrdinateur);
            System.out.println("La proposition du joueur est : " + propositionJoueur);
            System.out.println("Les indices donnés par l'Ordinateur = " + reponseOrdinateur);
            System.out.println("Les indices donnés par le Joueur = " + reponseJoueur);
            reponseOrdinateur.clear();
            propositionJoueur.clear();
            reponseJoueur.clear();
            System.out.println("*****************************************************************************************************************************************************************");

        }

    }

    // constructeurs

    public Duel() {

        combinaisonOrdinateur = new ArrayList<>(); // initialisation
        choixOrdinateur();
        combinaisonJoueur = new ArrayList<>(); // initialisation
        choixJoueur();
        reponseOrdinateur = new ArrayList<>();
        reponseJoueur = new ArrayList<>();
        afficherChoix();
        propositionJoueur = new ArrayList<>();
        propositionOrdinateur = new ArrayList<>();
        aVosJeux();
        finPartie();
        //victoire();

    }

    public int finPartie() {
        Scanner sc = new Scanner(System.in);
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

}