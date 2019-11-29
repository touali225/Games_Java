package jeux;

import java.util.List;

public class Menu {
    private int nbTour;
    private int tailleCombinaison;


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

}
