package jeux;

public class Duel {


    boolean victoireJoueur;
    boolean victoireDefenseur;
    Challenger challenger ;
    Defenseur defenseur  ;

    public void aVosJeux() {
        victoireJoueur = false;
        victoireDefenseur = false;
        while (!victoireJoueur && !victoireDefenseur) {
            victoireJoueur = challenger.tourChallenger();//tour challenger
            victoireDefenseur = defenseur.tourDefenseur();//tour defenseur
        }
        if(victoireJoueur && victoireDefenseur){
            System.out.println("Vous avez la même combinaison !"); //
        }
        else if (victoireJoueur) {

            Menu.affichageVictoireDuel(challenger.combinaisonSecrete);
            //Menu.affichageVictoireDefenseur(defenseur.combinaisonJoueur);
        } else {
            Menu.affichageDefaiteDuel(challenger.combinaisonSecrete);
            //Menu.affichageDefaiteDefenseur(defenseur.combinaisonJoueur);
        }

    }


    public Duel() {

        challenger = new Challenger();
        defenseur = new Defenseur();

        //System.out.println("La combinaison secrete de l'ordinateur est :" +challenger.combinaisonSecrete);
        //System.out.println("La combinaison secrete joueur est :" +defenseur.combinaisonJoueur);

    }

}