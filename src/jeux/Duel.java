package jeux;

import java.util.*;

public class Duel {

//    private List<Integer> combinaisonJoueur;
//    private List<Integer> combinaisonSecrete;
//    private List<Integer> propositionJoueur;
//    private List<Integer> propositionOrdinateur;
//    private ArrayList<String> reponseJoueur;
//    private ArrayList<String> reponseOrdinateur;
//    private boolean agagne;

    // choix des joueurs

//    public void combinaisonOrdinateur() {
//        //combinaisonSecrete = Utilitaire.generationCombinaisonAleatoire();
//
//    }

//    public void combinaisonJoueur() {
//        //Scanner sc = new Scanner(System.in);
//
//        Menu.affichageDuel();
//        Menu.affichageSaisieUtilisateur();
//        //combinaisonJoueur = Utilitaire.saisieUtilisateur();
//
//    }


//    public void afficherCombinaison() {
//
//
//        for (int i = 0; i < combinaisonJoueur.size(); i++) {
//
//            if (combinaisonJoueur.get(i) > combinaisonSecrete.get(i)) {
//                reponseJoueur.add("+");
//                reponseOrdinateur.add("-");
//            } else if (combinaisonJoueur.get(i) == combinaisonSecrete.get(i)) {
//                reponseJoueur.add("=");
//                reponseOrdinateur.add("=");
//            } else {
//                reponseJoueur.add("-");
//                reponseOrdinateur.add("+");
//            }
//
//
//        }
//
//        Menu.affichageResponseDuel(reponseOrdinateur,reponseJoueur);
//        reponseOrdinateur.clear();
//        reponseJoueur.clear();
//    }

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

            Menu.affichageVictoire(challenger.combinaisonSecrete);
            Menu.affichageVictoireDefenseur(defenseur.combinaisonJoueur);
        } else {
            Menu.affichageDefaite(challenger.combinaisonSecrete);
            Menu.affichageDefaiteDefenseur(defenseur.combinaisonJoueur);
        }


//        if (victoireDefenseur) {
//
//        } else {
//
//        }


        //mettre le resultat du jeu selon un test conditionnel qui a gagné




        //propositionOrdinateur = Utilitaire.generationCombinaisonAleatoire();

//        while ((combinaisonSecrete != combinaisonJoueur) && ((propositionJoueur != propositionOrdinateur))) {
//            propositionJoueur = Utilitaire.saisieUtilisateur();
//
//            for (int i = 0; i <= 3; i++) {
//
//
//                int a = propositionOrdinateur.get(i);
//                if (propositionOrdinateur.get(i) > combinaisonJoueur.get(i)) {
//                    a--;
//                    propositionOrdinateur.set(i, a);
//                } else if (propositionOrdinateur.get(i) == combinaisonJoueur.get(i)) {
//                } else {
//                    a++;
//                    propositionOrdinateur.set(i, a);
//                }
//            }
//
//            for (int i = 0; i < combinaisonSecrete.size(); i++) {
//
//                if (propositionJoueur.get(i) > combinaisonSecrete.get(i)) {
//                    reponseOrdinateur.add("-");
//                } else if (propositionJoueur.get(i) == combinaisonSecrete.get(i)) {
//                    reponseOrdinateur.add("=");
//                } else {
//                    reponseOrdinateur.add("+");
//                }
//            }
//            for (int i = 0; i < combinaisonJoueur.size(); i++) {
//
//                if (propositionOrdinateur.get(i) > combinaisonJoueur.get(i)) {
//                    reponseJoueur.add("-");
//                } else if (propositionOrdinateur.get(i) == combinaisonJoueur.get(i)) {
//                    reponseJoueur.add("=");
//                } else {
//                    reponseJoueur.add("+");
//                }
//            }
//
//            if((propositionJoueur).equals(combinaisonSecrete)) {
//                System.out.println("Bravo, vous avez gagné !!!");
//                System.out.println("En effet, la combinaison de l'ordinateur est : " + combinaisonSecrete);
//                break;
//            }
//
//            if((propositionOrdinateur).equals(combinaisonJoueur)) {
//                System.out.println("Désolé, vous avez perdu !!!");
//                System.out.println("L'ordinateur a deviné votre combinaison : " + combinaisonJoueur);
//                System.out.println("La combinaison secrète de l'ordinateur était : " + combinaisonSecrete);
//                break;
//            }
//
//            Menu.affichageResponseDuel(reponseOrdinateur, reponseJoueur);
//            reponseOrdinateur.clear();
//            propositionJoueur.clear();
//            reponseJoueur.clear();
//       }
    }

    // constructeurs

    public Duel() {

        challenger = new Challenger();
        defenseur = new Defenseur();

//        combinaisonSecrete = Utilitaire.generationCombinaisonAleatoire();
       System.out.println("La combinaison secrete de l'ordinateur est :" +challenger.combinaisonSecrete); // combinaisonsecrete de l'objet challenger
//        combinaisonJoueur = Utilitaire.saisieUtilisateur();
        System.out.println("La combinaison secrete joueur est :" +defenseur.combinaisonJoueur); // combinaison joueur de l'objet defenseur

        //reponseOrdinateur = new ArrayList<>();
        //reponseJoueur = new ArrayList<>();
//        afficherCombinaison();
//        propositionJoueur = new ArrayList<>();
//        propositionOrdinateur = new ArrayList<>();


    }

}