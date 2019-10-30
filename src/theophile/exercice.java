package theophile;

public class exercice {
    public static void main( String [] args) {







        int k = 11;
        int t = 16;
        if (k == t) {
            System.out.println("k et t sont identiques");
        }
        else if (k + 3 == t - 2) {
            System.out.println("k et t sont différents mais nous pouvons ajuster");
        }
        else {
            System.out.println("k et t sont très différents");
        }


        String [] mesEnfants; //declarer le tableau
        mesEnfants = new String[2]; // créer le tableau
        mesEnfants[0] = "Touali Chris Yvann";
        mesEnfants[1] = "Touali Chris Nolan";
        System.out.println(" Mon premier garçon se prenomme " + mesEnfants[0] + " \n le second se prenomme " + mesEnfants[1]);

        // Déclarer la variable int onGoingAllowance
        int onGoingAllowance = 200;
        onGoingAllowance = onGoingAllowance - 50;

        // Déclarer la variable int savings

        int savings = 3000;
        savings = savings + 100;

        // Déclarer la variable int bonusAllowance

        int bonusAllowance=500;

        // Mise à jour sur le delai d'épargne

        int numberOfDayToSave =(5000 - onGoingAllowance) / 500;

        // Mettre à jour son indemnité

        onGoingAllowance = onGoingAllowance + (30 - 10) * 7;


        // Déclarer des constantes

        final int joursDeLaSemaine=7;
        final int moisDeLAnnee=12;
        final int anniversaireTheophile=14051984;

        int a = 10;
        double b = 4;
        double c = a/ (double)b;
        System.out.println("" + c);

        String city = "new york";
        String movies = "Best Ever";
        String pet;
        String emptyString = "";

        String myFisrtCity = "New York";
        String mySecondFavouriteCity = "Buenos Aires";
        String myFavouriteCity = "myFisrtCity + mySecondFavouriteCity";
        System.out.println("My Favourite cities are " + myFisrtCity + " and " + mySecondFavouriteCity);



        // Afficher les résultats

        System.out.println("You have an ongoing allowance of " + onGoingAllowance +"\nYour savings amount is savings "
                + savings +"\nYou have a bonus allowance " + bonusAllowance);


























    }
}
