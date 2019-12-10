package jeux;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    private int nbTour;
    private int tailleCombinaison;

    public static void affichageDuel(){

        System.out.println("");
        System.out.println("SPECIFICATIONS");
        System.out.println("");
        System.out.println("Le joueur et l’intelligence artificielle de l’ordinateur jouent tour à tour. ");
        System.out.println("Le premier à trouver la combinaison secrète de l'autre a gagné !");
        System.out.println("Bonne Chance ! ");
        System.out.println("");
    }

    public static void affichageResponseDuel(ArrayList<String> i, ArrayList<String>j){
        System.out.println("*****************************************************************************************************************************************************************");
        System.out.println("Les indices donnés par l'Ordinateur = " + i);
        System.out.println("Les indices donnés par le Joueur = " + j);
        System.out.println("*****************************************************************************************************************************************************************");

    }


    public static void affichageDefenseur(){
        System.out.println("");
        System.out.println("SPECIFICATIONS");
        System.out.println("");
        System.out.println("1- Le joueur (cette fois dans le rôle de défenseur) définit une combinaison de X chiffres aléatoirement.");
        System.out.println("2- L'intelligence artificielle de l’ordinateur doit faire une proposition d’une combinaison de X chiffres (c’est le rôle attaquant).");
        System.out.println("3- Le joueur indique pour chaque chiffre de la combinaison proposée si le chiffre de sa combinaison est plus grand (+), plus petit (-) ou si c’est le bon (=).");
        System.out.println("Bonne Chance ! N'oubliez pas, Il y a un nombre limité d’essais!");
        System.out.println("");
    }

    public static void affichageDefaiteDefenseur(List<Integer> i){

        System.out.println("Désolé, vous avez perdu !!!");
        System.out.println("L'ordinateur a déviné votre combinaison" + i);
    }

    public static void affichageVictoireDefenseur(List<Integer> i){

        System.out.println("Bravo, vous avez gagné !!!");
        System.out.println("En effet, l'ordinateur n'a pas déviné votre combinaison " +i);
    }

public static void affichageChallenger(){
        System.out.println("");
        System.out.println("SPECIFICATIONS");
        System.out.println("");
        System.out.println("L'intelligence artificielle de l’ordinateur joue le rôle de défenseur. Elle définit une combinaison de X chiffres aléatoirement.");
        System.out.println("Vous avez le rôle d’attaquant et vous devez faire une proposition d’une combinaison de X chiffres.");
        System.out.println("L'intelligence artificielle de l’ordinateur indique pour chaque chiffre de la combinaison proposée si le chiffre de sa combinaison est plus grand (+), plus petit (-) ou si c’est le bon (=).");
        System.out.println("Bonne Chance ! N'oubliez pas, Il y a un nombre limité d’essais!");
        System.out.println("");
    }


public static void affichageFinPartie(){
    System.out.println("");
    System.out.println(".............................................................................................................................");
    System.out.println("Que souhaitez - vous ?");
    System.out.println("1 - Rejouer une nouvelle partie ?");
    System.out.println("2 - Lancer un nouveau mode ?");
    System.out.println("3 - Sortir?");
}

public static void affichageDefaite(List<Integer> i){

    System.out.println("Désolé, vous avez perdu !!!");
    System.out.println("Vous auriez dû jouer" + i);
}

public static void affichageVictoire(List<Integer> i){

    System.out.println("Bravo, vous avez gagné !!!");
    System.out.println("En effet, l'ordinateur a bien joué " +i);
}

public static void affichageSaisieUtilisateur(){
    System.out.println("Merci de faire une proposition de 4 chiffres");

    }

    public static void affichageReponse(ArrayList<String> i){

        System.out.println("Les indices de l'ordinateur : " + i);
    }

    public static void affichageReponseDefenseur(ArrayList<String> j){

        System.out.println("Les indices du joueur : " + j);
    }

}
