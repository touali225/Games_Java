package theophile;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class Duel {
    private List <Integer> combinaisonJoueur;
    private List <Integer> combinaisonOrdinateur;
    private String reponse;
    private boolean agagne;


    // choix ordinateur

    public void choixOrdinateur(){
        Random random = new Random();

        for (int i = 0; i <= 3; i++) {
            int nbr = random.nextInt(10);
            combinaisonOrdinateur.add(nbr);// ajout de la liste crée
        }
    }

    public void choixJoueur() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <= 4; i++) {
            System.out.println("Merci de faire une proposition de 4 chiffres");

            //System.out.println("DSL");
            List<Integer> combinaisonJoueur = new ArrayList<>();
            String[] listTmp = sc.nextLine().split(""); //creation tableau temporaire en string
            for (String s : listTmp) {
                combinaisonJoueur.add(Integer.valueOf(s)); // conversion du string en integer
            }

        }
    }



    // constructeurs

    public Duel() {
         combinaisonOrdinateur  = new ArrayList<>(); // initialisation
        choixOrdinateur(); // creation automatique choix aordinateur

        combinaisonJoueur  = new ArrayList<>(); // initialisation
        choixJoueur(); // creation automatique choix aordinateur
    }

    // getteurs

    public int getCombinaisonJoueur() {
        return combinaisonJoueur;
    }

    public int getCombinaisonOrdinateur() {
        return combinaisonOrdinateur;
    }

    public String getReponse() {
        return reponse;
    }

    public boolean getAgagne() {
        return agagne;
    }


    // surcharger

    public String toString() {
        return "Duel{" +
                "combinaisonJoueur=" + combinaisonJoueur +
                ", combinaisonOrdinateur=" + combinaisonOrdinateur +
                ", reponse='" + reponse + '\'' +
                ", agagne=" + agagne +
                '}';
    }




}