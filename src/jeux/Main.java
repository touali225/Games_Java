package jeux;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    static Logger logger = LogManager.getLogger(Main.class);
    public static void main(String[] args) {
    logger.info("Lancement du programme");

        Jeu jeu = new Jeu();
        jeu.executionJeux();



    }

}