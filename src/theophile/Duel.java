package theophile;

import java.util.*;

public class Duel {

    private List<Integer> combinaisonSecreteJoueur;
    private List<Integer> combinaisonSecreteOrdinateur;
    private List<Integer> propositionJoueur;
    private List<Integer> propositionOrdinateur;
    private ArrayList<String> reponseJoueur;
    private ArrayList<String> reponseOrdinateur;
    private boolean agagne;

    // choix des joueurs

    public void combinaisonOrdinateur() {

        Random random = new Random();
        for (int i = 0; i <= 3; i++) {
            int nbr = random.nextInt(10);
            combinaisonSecreteOrdinateur.add(nbr);// ajout de la liste crée
        }
        //System.out.println("Le choix de l'ordinateur : " + combinaisonOrdinateur);
    }

    public void combinaisonJoueur() {

        Scanner sc = new Scanner(System.in);
        System.out.println("");
        System.out.println("SPECIFICATIONS");
        System.out.println("");
        System.out.println("Le joueur et l’intelligence artificielle de l’ordinateur jouent tour à tour. ");
        System.out.println("Le premier à trouver la combinaison secrète de l'autre a gagné !");
        System.out.println("Bonne Chance ! ");
        System.out.println("");

        System.out.println("Veuillez choisir une combinaison secrète de 4 chiffres");
        String[] listTmp = sc.nextLine().split(""); //creation tableau temporaire en string
        for (String s : listTmp) {
            combinaisonSecreteJoueur.add(Integer.valueOf(s)); // conversion du string en integer
        }

    }


    public void afficherCombinaison() {


        for (int i = 0; i < combinaisonSecreteJoueur.size(); i++) {

            if (combinaisonSecreteJoueur.get(i) > combinaisonSecreteOrdinateur.get(i)) {
                reponseJoueur.add("+");
                reponseOrdinateur.add("-");
            } else if (combinaisonSecreteJoueur.get(i) == combinaisonSecreteOrdinateur.get(i)) {
                reponseJoueur.add("=");
                reponseOrdinateur.add("=");
            } else {
                reponseJoueur.add("-");
                reponseOrdinateur.add("+");
            }


        }


        System.out.println("*****************************************************************************************************************************************************************");
        //System.out.println("La combinaison secrète de l'ordinateur est : " + combinaisonSecreteOrdinateur);
        //System.out.println("La combinaison secrète du joueur est : " + combinaisonSecreteJoueur);
        System.out.println("Les indices donnés par l'Ordinateur = " + reponseOrdinateur);
        System.out.println("Les indices donnés par le Joueur = " + reponseJoueur);
        reponseOrdinateur.clear();
        reponseJoueur.clear();
        System.out.println("*****************************************************************************************************************************************************************");

    }

    public void aVosJeux() {


        Random random = new Random();
        for (int i = 0; i <= 3; i++) {
            int nbr = random.nextInt(10);
            propositionOrdinateur.add(nbr);// ajout de la liste crée
        }


        while ((combinaisonSecreteOrdinateur != combinaisonSecreteJoueur) && ((propositionJoueur != propositionOrdinateur))) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Faites une proposition de 4 chiffres");
            String[] listTmp = sc.nextLine().split(""); //creation tableau temporaire en string
            for (String s : listTmp) {
                propositionJoueur.add(Integer.valueOf(s)); // conversion du string en integer
            }

            for (int i = 0; i <= 3; i++) {


                int a = propositionOrdinateur.get(i);
                if (propositionOrdinateur.get(i) > combinaisonSecreteJoueur.get(i)) {
                    a--;
                    propositionOrdinateur.set(i, a);
                } else if (propositionOrdinateur.get(i) == combinaisonSecreteJoueur.get(i)) {
                } else {
                    a++;
                    propositionOrdinateur.set(i, a);
                }
            }

            for (int i = 0; i < combinaisonSecreteOrdinateur.size(); i++) {

                if (propositionJoueur.get(i) > combinaisonSecreteOrdinateur.get(i)) {
                    reponseOrdinateur.add("-");
                } else if (propositionJoueur.get(i) == combinaisonSecreteOrdinateur.get(i)) {
                    reponseOrdinateur.add("=");
                } else {
                    reponseOrdinateur.add("+");
                }
            }
            for (int i = 0; i < combinaisonSecreteJoueur.size(); i++) {

                if (propositionOrdinateur.get(i) > combinaisonSecreteJoueur.get(i)) {
                    reponseJoueur.add("-");
                } else if (propositionOrdinateur.get(i) == combinaisonSecreteJoueur.get(i)) {
                    reponseJoueur.add("=");
                } else {
                    reponseJoueur.add("+");
                }
            }

                if((propositionJoueur).equals(combinaisonSecreteOrdinateur)) {
                    System.out.println("Bravo, vous avez gagné !!!");
                    System.out.println("En effet, la combinaison de l'ordinateur est : " + combinaisonSecreteOrdinateur);
                    break;
                }

                if((propositionOrdinateur).equals(combinaisonSecreteJoueur)) {
                    System.out.println("Désolé, vous avez perdu !!!");
                    System.out.println("L'ordinateur a deviné votre combinaison : " + combinaisonSecreteJoueur);
                    System.out.println("La combinaison secrète de l'ordinateur était : " + combinaisonSecreteOrdinateur);
                    break;
                }


            System.out.println("*****************************************************************************************************************************************************************");
            //System.out.println("La proposition de l'ordinateur est : " + propositionOrdinateur);
            //System.out.println("La proposition du joueur est : " + propositionJoueur);
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

        combinaisonSecreteOrdinateur = new ArrayList<>(); // initialisation
        combinaisonOrdinateur();
        combinaisonSecreteJoueur = new ArrayList<>(); // initialisation
        combinaisonJoueur();
        reponseOrdinateur = new ArrayList<>();
        reponseJoueur = new ArrayList<>();
        afficherCombinaison();
        propositionJoueur = new ArrayList<>();
        propositionOrdinateur = new ArrayList<>();
        aVosJeux();

    }

}