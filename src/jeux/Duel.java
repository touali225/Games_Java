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
            victoireJoueur = challenger.tourChallenger();
            victoireDefenseur = defenseur.tourDefenseur();
        }

        if(victoireJoueur && victoireDefenseur){
            System.out.println("Vous avez la même combinaison !");
        }
        else if (victoireJoueur) {
            Menu.affichageVictoireDuel(challenger.combinaisonSecrete);

        } else {
            Menu.affichageDefaiteDuel(challenger.combinaisonSecrete);
        }
    }
    public Duel() {

        challenger = new Challenger();
        defenseur = new Defenseur();
        if (Configuration.modeDev){
            System.out.println(" Mode dev activé ! La combinaison secrète de l'ordinateur " +challenger.combinaisonSecrete);
        }
    }
}