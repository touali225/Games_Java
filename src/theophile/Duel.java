package theophile;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Duel {

    private List<Integer> combinaisonJoueur;
    private List<Integer> combinaisonOrdinateur;
    private List<Integer> propositionJoueur;
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
        combinaisonJoueur.clear();
        System.out.println("*****************************************************************************************************************************************************************");

    }

    public void aVosJeux(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Faites une proposition de 4 chiffres");
        String[] listTmp = sc.nextLine().split(""); //creation tableau temporaire en string
        for (String s : listTmp) {
            combinaisonJoueur.add(Integer.valueOf(s)); // conversion du string en integer
        }

        for (int i = 0; i <= 3; i++) {

            int a = combinaisonOrdinateur.get(i);
            if (combinaisonOrdinateur.get(i) > combinaisonJoueur.get(i)) {
                a--;
                combinaisonOrdinateur.set(i, a);
            } else if (combinaisonOrdinateur.get(i) == combinaisonJoueur.get(i)) {
            } else {
                a++;
                combinaisonOrdinateur.set(i, a);

            }

        }

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
        combinaisonJoueur.clear();
        System.out.println("*****************************************************************************************************************************************************************");

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
        aVosJeux();




    }




}