import java.io.Console;
import java.util.List;
import java.util.ArrayList;

public class App {
  public static void main(String[] args) {
    Console myConsole = System.console();

    System.out.println("Welcome to the Event Planner.  Please answer the following questions to start planning your event.");

    System.out.println("How many guests will be attending?");
    Integer numOfGuests = Integer.parseInt(myConsole.readLine());


    boolean programRunning = true;
    List<String> userFoodMenu = new ArrayList<String>();
    String userChoice;

    while(programRunning) {
      System.out.println("Please enter the food that you want for the party.  Enter Exit after you are done.");
      userChoice = myConsole.readLine();
      if (userChoice.equals("Exit")) {
        programRunning = false;
      } else {
        userFoodMenu.add(userChoice);
      }
    }

//Display the Event details and estimated cost for the user to review
  }
}
