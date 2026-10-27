package Incidents;
/*För varje incident ska ni först gissa vad som händer innan ni kör koden. Svara sedan på: När upptäcks felet?
Vilken feltyp/exception är det? Bör felet rättas,fångas eller hanteras på annat sätt? 
Incident B - Fel dörr */

public class IncidentB {
    int[] doors = {1, 2, 3};
   // System.out.println(doors[5]); Causes ArrayOutOfBoundException.

   //Solution:

   public static void main(String[] args) {

    int[] doors = {1, 2, 3};
    try {
        System.out.println(doors[5]); // This line will cause an ArrayIndexOutOfBoundsException
    } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("This door does not exist!");
       
    }

    System.out.println("Gamme Continues...");
    
}

}