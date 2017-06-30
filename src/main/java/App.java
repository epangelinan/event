import java.io.Console;
import java.util.List;
import java.util.ArrayList;

public class App {
  public static void main(String[] args) {
    Console myConsole = System.console();

    System.out.println("Welcome to the Event Planner.  Please answer the following questions to start planning your event.");

    System.out.println("How many guests will be attending?");
    int numOfGuests = Integer.parseInt(myConsole.readLine());


    boolean programRunning = true;
    List<String> userFoodMenu = new ArrayList<String>();
    List<String> userBeverageMenu = new ArrayList<String>();
    List<String> userEntertainmentMenu = new ArrayList<String>();

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

    System.out.println(userFoodMenu);

    programRunning = true;
    while(programRunning) {
      System.out.println("Please enter the beverages that you want for the party.  Enter Exit after you are done.");
      userChoice = myConsole.readLine();
      if (userChoice.equals("Exit")) {
        programRunning = false;
      } else {
        userBeverageMenu.add(userChoice);
      }
    }

    System.out.println(userBeverageMenu);

    System.out.println("Would you like to add entertainment to your party? Please enter Yes or No");
    String entertainmentAnswer = myConsole.readLine();

    if (entertainmentAnswer.equals("Yes")) {
      programRunning = true;
      while(programRunning) {
        System.out.println("Please enter the entertainment that you want for the party.  Enter Exit after you are done.");
        userChoice = myConsole.readLine();
        if (userChoice.equals("Exit")) {
          programRunning = false;
        } else {
          userEntertainmentMenu.add(userChoice);
        }
      }
    } else {
      userEntertainmentMenu.add("None");
    }

    System.out.println(userEntertainmentMenu);

    Event userEvent = new Event(numOfGuests, userFoodMenu, userBeverageMenu, userEntertainmentMenu);

    System.out.println("Thanks!  Here are your event details:");
    System.out.println("Number of Guests");
    System.out.println("----------------");
    System.out.println(userEvent.getNumberOfGuests());
    System.out.println("");

    System.out.println("Food Menu");
    System.out.println("---------");
    for (String individualFood: userFoodMenu) {
      System.out.println(individualFood);
    }
    System.out.println("");

    System.out.println("Beverages Menu");
    System.out.println("--------------");
    for (String individualBeverage: userBeverageMenu) {
      System.out.println(individualBeverage);
    }
    System.out.println("");

    System.out.println("Entertainment");
    System.out.println("-------------");
    for (String individualEntertainment: userEntertainmentMenu) {
      System.out.println(individualEntertainment);
    }
    System.out.println("");

    double totalUserCost = userEvent.calculateCost();
    System.out.println(String.format("The total cost is $%.2f",totalUserCost));
  }
}
