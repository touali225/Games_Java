package theophile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Jeux {

    /************************************************************/   /* début de la fonction main() */   /************************************************************/

    public static void main(String[] args) {

        /* Déclaration des variables */
        int nombre_secret,int_nombre_propose;
        Float reel_nombre_propose;
        String chaine_nombre_propose;
        BufferedReader clavier;

        /* initialisation des variables */
        int_nombre_propose=-1;
        chaine_nombre_propose=""; /* chaine vide */
        clavier=new BufferedReader(new InputStreamReader(System.in));

        /* choisi un nombre au hasard entre 0 (compris) et 1000 (nom compris) : */
        nombre_secret=(int) (Math.random() * 1000);
        /* début de la boucle while */
        while(int_nombre_propose!=nombre_secret) {
            System.out.print("Entrez un nombre : ");

            /* saisie une chaine de caractère au clavier */
            try { chaine_nombre_propose=clavier.readLine(); }
            catch(IOException e) { }

            /* convertit la chaine chaine_nombre_propose en réel reel_nombre_propose */
            reel_nombre_propose=Float.valueOf(chaine_nombre_propose);

            /* convertit le réel reel_nombre_propose en entier int_nombre_propose */
            int_nombre_propose=reel_nombre_propose.intValue();

            /* compare le nombre entier proposé au nombre secret : */
            if (int_nombre_propose>nombre_secret)
                System.out.println("Le nombre cherché est plus petit que"+int_nombre_propose);

            if (int_nombre_propose<nombre_secret)
                System.out.println("Le nombre cherché est plus grand que"+int_nombre_propose);

        } /* fin de la boucle while */
        System.out.println("Bravo, vous avez trouvé le nombre recherché !");
    } /* fin de la fonction main() */ } /* fin de la classe */