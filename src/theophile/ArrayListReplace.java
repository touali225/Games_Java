package theophile;

import java.util.ArrayList;

public class ArrayListReplace {

    public static void main(String[] args) {

        // Créer un ArrayList<Integer>
        ArrayList<Integer> aList = new ArrayList<Integer>();

        //ajouter des digits à ArrayList
        aList.add(1);
        aList.add(2);
        aList.add(3);
        aList.add(4);

        System.out.println("ArrayList ");
        for(int e:aList)
            System.out.println(e);

        aList.set(2, 0);
        aList.set(3, 0);

        System.out.println("ArrayList ");
        for(int e:aList)
            System.out.println(e);
    }
}
