public class TestStr{



    public static void main(String[] args){
        String [] tab1 = new String[3];
        String [] tab2 = new String[2];

        String contenu1="";
        String contenu2="";
        tab1[0]="salut";
        tab1[1]="bonsoir";




        tab2[0]="salut";
        tab2[1]="bonjour";
        for(int i=0;i<tab1.length;i++){
            if(tab1[i] != null)contenu1 +=tab1[i];
        }

        for(int i=0;i<tab2.length;i++){
            contenu2 +=tab2[i];
        }
        if(contenu1.equals(contenu2)){
            System.out.println("contenu1:" +contenu1 );
            System.out.println("contenu2:" +contenu2 );
            System.out.println("les deu tableaux ont le meme contenu");
        }else {

            System.out.println("contenu1:" +contenu1 );
            System.out.println("contenu2:" +contenu2 );
            System.out.println("non c'est pas pareil");
        }



    }
}
