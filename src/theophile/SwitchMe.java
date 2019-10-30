package theophile;

public class SwitchMe {
    enum Color {
        blue, green, red, yellow;
    }
    public static void main(String[] args) {

        Color selectedColor = Color.green;

        //TODO: remplacez les conditions if/else par un switch qui fonctionnera d'après la valeur de la variable selectedColor
        switch (selectedColor){
            case blue :
                System.out.println("The color is blue");
                break;

            case green :
                System.out.println("The color is green");
                break;

            case red :
                System.out.println("The color is red");
                break;

            case yellow :
                System.out.println("The color is yellow");
                break;

            default:
                System.out.println("We do not know the color!");
                break;



        }
    }
}

