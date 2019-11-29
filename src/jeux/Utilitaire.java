package jeux;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Utilitaire {



    public static void saisieUtilisitaire(){

    }

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
