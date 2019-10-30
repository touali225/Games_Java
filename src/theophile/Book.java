package theophile;
public class Book {
    String title;
    String author;
    int numberOfPages;


    public static void main(String[] args) {
        //TODO Etape 1 - instanciez un objet de la classe Book et affectez-le à une variable nommée myBook
        Book myBook = new Book();

        //TODO Etape 2 - attribuez une valeur aux champs title, author et numberOfPages de votre objet

        myBook.title = "J'ai décidé de te quitter";
        myBook.author = "Théophile Touali";
        myBook.numberOfPages = 210;



        //Affiche les valeurs
        System.out.println("The title of the book is " + myBook.title + "\nIts author is " + myBook.author + "\nIt contains " + myBook.numberOfPages);

    }

}
