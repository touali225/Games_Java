package theophile;

public class Main {

    public static void main(String[] args) {




        int choixJoueur;
        int choixJoueur1;
        Mode mode = new Mode();
        mode.jeuAlaDemande();

        do {


           choixJoueur = mode.finPartie();


            if (choixJoueur ==1){
                mode.askChallenger();

            } else if (choixJoueur ==2)
            {
                mode.jeuAlaDemande();
            } else if (choixJoueur ==3)
            {
                break;
            } else{
                System.out.println("Merci de faire un choix parmi les chiffres proposés !!!");
            }


        } while (choixJoueur !=3);


    }

}