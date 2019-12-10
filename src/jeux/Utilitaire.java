package jeux;

import java.util.*;


public class Utilitaire {

    /**
     * ELABORATION DE LA COMBINAISON DU JOUEUR
     */

    public static ArrayList<String>generationReponse(){

        List<Integer> combinaisonJoueur = new ArrayList<>();
        List<Integer> combinaisonSecrete = new ArrayList<>();
        ArrayList<String> reponse = new ArrayList<>();

        for (int j = 0; j < combinaisonSecrete.size(); j++) {

            if (combinaisonSecrete.get(j) > combinaisonJoueur.get(j))
                reponse.add("+");
            else if (combinaisonSecrete.get(j) == combinaisonJoueur.get(j))
                reponse.add("=");
            else
                reponse.add("-");
        }return reponse;
    }


    public static List<Integer>saisieUtilisateur(){
        Scanner sc = new Scanner(System.in);

        List<Integer> combinaisonJoueur = new ArrayList<>();
try {


    String[] listTmp = sc.nextLine().split(""); //creation tableau temporaire en string
    for (String s : listTmp) {
        combinaisonJoueur.add(Integer.valueOf(s)); // conversion du string en integer
    }
} catch (Exception e){
    System.out.println("Erreur Saisie, valeur par defaut 1234");
    combinaisonJoueur.add(0);
    combinaisonJoueur.add(1);
    combinaisonJoueur.add(2);
    combinaisonJoueur.add(3);
        }
    return combinaisonJoueur;
    }

    /**
     * ELABORATION DE LA COMBINAISON ALEATOIRE
     */
    public static List<Integer> generationCombinaisonAleatoire (){
        Random random = new Random();
        List<Integer> combinaisonSecrete = new ArrayList<>();//Integer la version objet  de int creer une liste
        for (int j = 0; j <= 3; j++) {
            int nbr = random.nextInt(10);
            combinaisonSecrete.add(nbr);// ajout de la liste crée
        }
        return combinaisonSecrete;

    }

}
