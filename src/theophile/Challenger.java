package theophile;

import java.util.Random;
import java.util.Scanner;

public class Challenger {
        public static void main(String [] args){

            Scanner sc = new Scanner(System.in);

            Random combinaisonOrdi = new Random();
            for(int i = 0; i<=4; i++){
                int nbr = combinaisonOrdi.nextInt(10000);

                System.out.println("Taper votre combinaison de quatre chiffres svp");
                int combinaisonJoueur = sc.nextInt();
                if(combinaisonJoueur > nbr){
                    System.out.println(" Votre combinaison est superieur à celle de l'ordinateur");

                }else if(combinaisonJoueur < nbr) {
                    System.out.println("Votre combinaison est inférieure à celle de l'ordinateur");
                } else if(combinaisonJoueur == nbr){
                    System.out.println("Votre combinaison est identique à celle de l'ordinateur");
                } else{
                    System.out.println("Merci de bien vouloir saisir une combinaison de quatre chiffres");
                }




            }

            /*System.out.println("Vous avez saisi : " + );
            System.out.println("La voici :" +nbr);*/




            /*if ( combinaisonJoueur < nbr ) {
                System.out.println(" combinaisonJoueur est plus petit que nbr ");
            } else if ( combinaisonJoueur > nbr ) {
                System.out.println(" combinaisonJoueur est plus grand que nbr ");
            } else {
                System.out.println (" combinaisonJoueur est égale à nbr ") ;
            }
            System.out.println("La voici :" +nbr);



        /*if(nbr == combinaisonJoueur){
            System.out.println("Bravo, vous avez gagné !");

        }else {
            System.out.println("Désolé, vous n'avez pas la bonne combinaison");
            System.out.println("La voici :" +nbr);
        }*/


            /*System.out.println("Nombre aléatoire :" +nbr);*/
        /*for (int i=0; i<4; i++){
            int nbr = obj.nextInt(10000);
            System.out.println("Nombre aléatoire :" +nbr);
        }*/
            /*keyboard.close();*/
        }

    }