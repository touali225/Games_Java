//package jeux;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class Final {
//
//    public class Duel {
//
//        private List<Integer> combinaisonJoueur;
//        private List<Integer> combinaisonSecrete;
//        private List<Integer> propositionJoueur;
//        private List<Integer> propositionOrdinateur;
//        private ArrayList<String> reponseJoueur;
//        private ArrayList<String> reponseOrdinateur;
//        private boolean agagne;
//
//        // choix des joueurs
//
//
//        public void combinaisonOrdinateur() {
//            ArrayList<String> reponse = new ArrayList<>();
//            List<Integer> combinaisonSecrete = Utilitaire.generationCombinaisonAleatoire();//Integer la version objet  de int creer une liste
//        }
//
//        public void combinaisonJoueur() {
//            Scanner sc = new Scanner(System.in);
//            Menu.affichageDuel();
//            Utilitaire.saisieUtilisateur();
//            List<Integer> combinaisonJoueur = Utilitaire.saisieUtilisateur();
//
//        }
//
//
//        public void afficherCombinaison() {
//
//
//            for (int i = 0; i < combinaisonJoueur.size(); i++) {
//
//                if (combinaisonJoueur.get(i) > combinaisonSecrete.get(i)) {
//                    reponseJoueur.add("+");
//                    reponseOrdinateur.add("-");
//                } else if (combinaisonJoueur.get(i) == combinaisonSecrete.get(i)) {
//                    reponseJoueur.add("=");
//                    reponseOrdinateur.add("=");
//                } else {
//                    reponseJoueur.add("-");
//                    reponseOrdinateur.add("+");
//                }
//
//
//            }
//
//            Menu.affichageDoubleReponse(reponseJoueur, reponseOrdinateur);
//
//
//        }
//
//        public void aVosJeux() {
//
//            Utilitaire.generationCombinaisonAleatoire();
//
//            while ((combinaisonSecrete != combinaisonJoueur) && ((propositionJoueur != propositionOrdinateur))) {
//
//                Utilitaire.saisieUtilisateur();
//
//                /**
//                 * MODIFICATION DE LA COMBINAISON DE L'ORDINATEUR
//                 */
//
//                for (int i = 0; i <= 3; i++) {
//
//                    int a = propositionOrdinateur.get(i);
//                    if (propositionOrdinateur.get(i) > combinaisonJoueur.get(i)) {
//                        a--;
//                        propositionOrdinateur.set(i, a);
//                    } else if (propositionOrdinateur.get(i) == combinaisonJoueur.get(i)) {
//                    } else {
//                        a++;
//                        propositionOrdinateur.set(i, a);
//                    }
//                }
//
//                /**
//                 * AFFICHAGE DE LA REPONSE BASEE SUR LES PROPOSITIONS
//                 */
//
//                for (int i = 0; i < combinaisonSecrete.size(); i++) {
//
//                    if (propositionJoueur.get(i) > combinaisonSecrete.get(i)) {
//                        reponseOrdinateur.add("-");
//                    } else if (propositionJoueur.get(i) == combinaisonSecrete.get(i)) {
//                        reponseOrdinateur.add("=");
//                    } else {
//                        reponseOrdinateur.add("+");
//                    }
//                }
//                for (int i = 0; i < combinaisonJoueur.size(); i++) {
//
//                    if (propositionOrdinateur.get(i) > combinaisonJoueur.get(i)) {
//                        reponseJoueur.add("-");
//                    } else if (propositionOrdinateur.get(i) == combinaisonJoueur.get(i)) {
//                        reponseJoueur.add("=");
//                    } else {
//                        reponseJoueur.add("+");
//                    }
//                }
//
//
//                /**
//                 * AFFICHAGE DE LA VICTOIRE DU JOUEUR
//                 */
//
//                if((propositionJoueur).equals(combinaisonSecrete)) {
//                    Menu.affichageVictoire(combinaisonJoueur);
//                    break;
//                }
//
//
//                /**
//                 * AFFICHAGE DE LA DEFAITE DU JOUEUR
//                 */
//                if((propositionOrdinateur).equals(combinaisonJoueur)) {
//                    Menu.affichageDefaiteDuel(combinaisonSecrete, combinaisonJoueur);
//                    break;
//                }
//
//
//                Menu.affichageResultatFinal(reponseOrdinateur, reponseJoueur);
//                propositionJoueur.clear();
//
//
////            System.out.println("*****************************************************************************************************************************************************************");
////            System.out.println("La proposition de l'ordinateur est : " + propositionOrdinateur);
////            System.out.println("La proposition du joueur est : " + propositionJoueur);
////            System.out.println("Les indices donnés par l'Ordinateur = " + reponseOrdinateur);
////            System.out.println("Les indices donnés par le Joueur = " + reponseJoueur);
////            reponseOrdinateur.clear();
////            propositionJoueur.clear();
////            reponseJoueur.clear();
////            System.out.println("*****************************************************************************************************************************************************************");
//            }
//        }
//
//        // constructeurs
//
//        public Duel() {
//
//            combinaisonSecrete = new ArrayList<>(); // initialisation
//            combinaisonOrdinateur();
//            combinaisonJoueur = new ArrayList<>(); // initialisation
//            combinaisonJoueur();
//            reponseOrdinateur = new ArrayList<>();
//            reponseJoueur = new ArrayList<>();
//            afficherCombinaison();
//            propositionJoueur = new ArrayList<>();
//            propositionOrdinateur = new ArrayList<>();
//            aVosJeux();
//
//        }
//
//    }
//}
