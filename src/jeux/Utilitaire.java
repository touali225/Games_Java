package jeux;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.*;

public class Utilitaire {
    static Logger logger = LogManager.getLogger(Utilitaire.class);
    /**
     * ELABORATION DE LA COMBINAISON DU JOUEUR
     */

    public static List<Integer>saisieUtilisateur(){
        Scanner sc = new Scanner(System.in);
        List<Integer> combinaisonJoueur = new ArrayList<>();

        do {

            combinaisonJoueur.clear();

            try {

                String combinaisonTemporaire = sc.nextLine();
                if(combinaisonTemporaire.length()==Configuration.tailleCombinaison){
                    for (String s : combinaisonTemporaire.split("")) {
                        combinaisonJoueur.add(Integer.valueOf(s)); // conversion du string en integer
                    }

                }


            } catch (Exception e){
                logger.error(e);
                System.out.println("Erreur Saisie, valeur par defaut 1234");
                combinaisonJoueur.clear();
                for(int i=0; i<Configuration.tailleCombinaison; i++ ){
                    combinaisonJoueur.add(i);
                }
            }
            if(combinaisonJoueur.size()!= Configuration.tailleCombinaison){
                System.out.println("Renseignez une combinaison " + Configuration.tailleCombinaison + " Chiffres SVP !!!");

            }
        }  while (combinaisonJoueur.size()!= Configuration.tailleCombinaison);
        return combinaisonJoueur;
    }

    /**
     * ELABORATION DE LA COMBINAISON ALEATOIRE
     */
    public static List<Integer> generationCombinaisonAleatoire (){
        Random random = new Random();
        List<Integer> combinaisonSecrete = new ArrayList<>();
        for (int j = 0; j <= 3; j++) {
            int nbr = random.nextInt(10);
            combinaisonSecrete.add(nbr);
        }
        return combinaisonSecrete;

    }
}