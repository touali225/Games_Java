package theophile;

public class Unicorn {

    public static void main(String[] args) {

        int numberOfCups = 0;
        do {
            System.out.println("I'm feeling sleepy");
            numberOfCups += 1;
            System.out.println("I drunk " + numberOfCups + " cups of coffee");
        } while (numberOfCups < 10);
        System.out.println("I'm feeling awake now!");

        int x = 10;
        x += 12;
        final int y = x/4;
        x = x + y;

        System.out.println(x);
        System.out.println(y);


        //boucle for (le nombre d'itération est connu)

        String [] mesFruits = new String[]{"banane", "pomme", "orange", "Goyave", "Pamplemousse"};
        for(int k = 0; k<4; k++) {
            for (int i = 0; i < mesFruits.length; i++) {
                if (mesFruits[i] == "orange") {
                    System.out.println(" J'ai une " + mesFruits[i] + "!");
                }

            }
        }



        int [] monTableau = new int[] {9, 15, 35, 75, 2};
        /*for ( int number :monTableau)
        {
            System.out.println(number);
        }*/

        for(int i=0; i< monTableau.length; i++){
            System.out.println(monTableau[i]);

        }

        /*for ( int i =0; i<=5; i++)
        {
            System.out.println("Bonjour Théophile Touali");
        }*/

        // boucle while (tant que l'instruction est vraie)

        int numberOfThree=0;

        while (numberOfThree<10)
        {
            numberOfThree +=1;
            System.out.println(" J'ai planté " + numberOfThree + " arbres");
        }
        System.out.println(" J'ai une veritable forêt");

        // boucle do while (tant que la condition est vraie)

        int pushUpGoal=10;

        do {
            System.out.println("Push Up");
            pushUpGoal-=1;


        }
        while( pushUpGoal>0);


    }
}
