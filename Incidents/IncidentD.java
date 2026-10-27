package Incidents;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*För varje incident ska ni först gissa vad som händer innan ni kör koden. Svara sedan på: När upptäcks felet?
Vilken feltyp/exception är det? Bör felet rättas,fångas eller hanteras på annat sätt? 
Incident D - Försvunnen save-fil
 */

public class IncidentD {

    //Scanner saveFile = new Scanner(new File("savegame.txt")); 

    //System.out.println(saveFile.nextLine()); 

    //saveFile.close(); 

    // This causes a FileNotFoundException
    //  because the file "savegame.txt" does not exist in the specified path.


    //Solution:
     public static void main(String[] args) {

        try (Scanner saveFile =
                     new Scanner(new File("savegame.txt"))) {

            System.out.println(saveFile.nextLine());

        } catch (FileNotFoundException e) {

            System.out.println("Save file not found!");
            System.out.println("Starting a new game instead.");
        }
    }

}
