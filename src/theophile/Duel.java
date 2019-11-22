package theophile;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

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

        for (int k = 0; k < combinaisonJoueur.size(); k++) {

            if (combinaisonJoueur.get(k) > combinaisonOrdinateur.get(k)) {
                reponseJoueur.add("+");
                reponseOrdinateur.add("-");
            } else if (combinaisonJoueur.get(k) == combinaisonOrdinateur.get(k)) {
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

    }
//    public String afficherChoix(List combinaisonOrdinateur, List combinaisonJoueur){
//        return "Les combinaisons secrètes sont : Ordinateur = " + this.combinaisonOrdinateur + "Joueur" + this.combinaisonJoueur;
//        }



//        // Je veux creer une methode confrontation
//        for (int i = 0; i <= 1; i++) {
//            if (combinaisonOrdinateur.get(i) == combinaisonJoueur.get(i)) {
//                System.out.println("");
//                System.out.println("Oups !!! Vous avez la même combinaison");
//
//            }
//        }




    // constructeurs

    public Duel() {

        combinaisonOrdinateur = new ArrayList<>(); // initialisation
        choixOrdinateur();
        combinaisonJoueur = new ArrayList<>(); // initialisation
        choixJoueur();
        //afficherChoix(combinaisonOrdinateur, combinaisonJoueur);
        reponseOrdinateur = new ArrayList<>();
        reponseJoueur = new ArrayList<>();
        afficherChoix();




    }




}