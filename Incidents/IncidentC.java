package Incidents;

/*För varje incident ska ni först gissa vad som händer innan ni kör koden. Svara sedan på: När upptäcks felet?
Vilken feltyp/exception är det? Bör felet rättas,fångas eller hanteras på annat sätt? 
Incident C - Den namnlösa spelaren */


public class IncidentC {

    //String playerName = null;
   // System.out.println(playerName.length()); //This line will cause a NullPointerException

   //Solution:
   public static void main(String[] args) {

    String playerName = null;

    try {
        System.out.println(playerName.length());
    } catch (NullPointerException e) {
        System.out.println("Player name is not set!");
    }

    System.out.println("Game Continues...");
    
}

}
