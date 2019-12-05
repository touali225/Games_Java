package jeux;

import java.util.*;

public class Duel {

    private List<Integer> combinaisonJoueur;
    private List<Integer> combinaisonSecrete;
    private List<Integer> propositionJoueur;
    private List<Integer> propositionOrdinateur;
    private ArrayList<String> reponseJoueur;
    private ArrayList<String> reponseOrdinateur;
    private boolean agagne;

    // choix des joueurs

    public void combinaisonOrdinateur() {
        combinaisonSecrete = Utilitaire.generationCombinaisonAleatoire();

    }

    public void combinaisonJoueur() {
        Scanner sc = new Scanner(System.in);

        Menu.affichageDuel();
        Menu.affichageSaisieUtilisateur();
        combinaisonJoueur = Utilitaire.saisieUtilisateur();

    }


    public void afficherCombinaison() {


        for (int i = 0; i < combinaisonJoueur.size(); i++) {

            if (combinaisonJoueur.get(i) > combinaisonSecrete.get(i)) {
                reponseJoueur.add("+");
                reponseOrdinateur.add("-");
            } else if (combinaisonJoueur.get(i) == combinaisonSecrete.get(i)) {
                reponseJoueur.add("=");
                reponseOrdinateur.add("=");
            } else {
                reponseJoueur.add("-");
                reponseOrdinateur.add("+");
            }


        }

        Menu.affichageResponseDuel(reponseOrdinateur,reponseJoueur);
        reponseOrdinateur.clear();
        reponseJoueur.clear();
    }

    public void aVosJeux() {

        propositionOrdinateur = Utilitaire.generationCombinaisonAleatoire();

        while ((combinaisonSecrete != combinaisonJoueur) && ((propositionJoueur != propositionOrdinateur))) {
            propositionJoueur = Utilitaire.saisieUtilisateur();

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

            for (int i = 0; i < combinaisonSecrete.size(); i++) {

                if (propositionJoueur.get(i) > combinaisonSecrete.get(i)) {
                    reponseOrdinateur.add("-");
                } else if (propositionJoueur.get(i) == combinaisonSecrete.get(i)) {
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

            if((propositionJoueur).equals(combinaisonSecrete)) {
                System.out.println("Bravo, vous avez gagné !!!");
                System.out.println("En effet, la combinaison de l'ordinateur est : " + combinaisonSecrete);
                break;
            }

            if((propositionOrdinateur).equals(combinaisonJoueur)) {
                System.out.println("Désolé, vous avez perdu !!!");
                System.out.println("L'ordinateur a deviné votre combinaison : " + combinaisonJoueur);
                System.out.println("La combinaison secrète de l'ordinateur était : " + combinaisonSecrete);
                break;
            }

            Menu.affichageResponseDuel(reponseOrdinateur, reponseJoueur);
            reponseOrdinateur.clear();
            propositionJoueur.clear();
            reponseJoueur.clear();
       }
    }

    // constructeurs

    public Duel() {

        combinaisonSecrete = new ArrayList<>(); // initialisation
        combinaisonOrdinateur();
        combinaisonJoueur = new ArrayList<>(); // initialisation
        combinaisonJoueur();
        reponseOrdinateur = new ArrayList<>();
        reponseJoueur = new ArrayList<>();
        afficherCombinaison();
        propositionJoueur = new ArrayList<>();
        propositionOrdinateur = new ArrayList<>();
        aVosJeux();

    }

}