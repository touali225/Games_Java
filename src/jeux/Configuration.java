package jeux;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Configuration {
    Properties lectureProperties = new Properties ();
    FileInputStream fis ;
     static int nbreTour ;
     static int tailleCombinaison;
     static boolean modeDev;



     public Configuration (){
         try{

             fis = new FileInputStream(new File("C:\\Users\\LIGHTCOM\\IdeaProjects\\GAMEPLAYSTUDIO\\Escape Game ONLINE\\src\\config.properties"));
             lectureProperties.load(fis);
             nbreTour = Integer.parseInt(lectureProperties.getProperty("NbreTour"));
             tailleCombinaison = Integer.parseInt(lectureProperties.getProperty("TailleCombinaison"));
             modeDev = Boolean.parseBoolean(lectureProperties.getProperty("ModeDev"));

         } catch (FileNotFoundException e) {
             e.printStackTrace();
         } catch (IOException e) {
             e.printStackTrace();
         }

     }

}



