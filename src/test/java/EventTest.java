import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class EventTest {

  @Test
  public void getNumberOfGuests_enterOneGuest_1() {
    int testNumGuests = 1;
    List<String> testFoodMenu = new ArrayList<String>();
    testFoodMenu.add("pizza");
    List<String> testBeverageMenu = new ArrayList<String>();
    testBeverageMenu.add("soda");
    List<String> testEntertainmentMenu = new ArrayList<String>();
    testEntertainmentMenu.add("games");
    Event testEvent = new Event(testNumGuests, testFoodMenu, testBeverageMenu, testEntertainmentMenu);
    assertEquals(1, testEvent.getNumberOfGuests());
  }

  @Test
  public void getFood_enterOneFood_testFoodMenu() {
    int testNumGuests = 1;
    List<String> testFoodMenu = new ArrayList<String>();
    testFoodMenu.add("pizza");
    List<String> testBeverageMenu = new ArrayList<String>();
    testBeverageMenu.add("soda");
    List<String> testEntertainmentMenu = new ArrayList<String>();
    testEntertainmentMenu.add("games");
    Event testEvent = new Event(testNumGuests, testFoodMenu, testBeverageMenu, testEntertainmentMenu);
    assertEquals(testFoodMenu, testEvent.getFood());
  }

  @Test
  public void getBeverages_enterOneBeverage_testBeverageMenu() {
    int testNumGuests = 1;
    List<String> testFoodMenu = new ArrayList<String>();
    testFoodMenu.add("pizza");
    List<String> testBeverageMenu = new ArrayList<String>();
    testBeverageMenu.add("soda");
    List<String> testEntertainmentMenu = new ArrayList<String>();
    testEntertainmentMenu.add("games");
    Event testEvent = new Event(testNumGuests, testFoodMenu, testBeverageMenu, testEntertainmentMenu);
    assertEquals(testBeverageMenu, testEvent.getBeverages());
  }

  @Test
  public void getEntertainment_enterOneBeverage_testEntertainmentMenu() {
    int testNumGuests = 1;
    List<String> testFoodMenu = new ArrayList<String>();
    testFoodMenu.add("pizza");
    List<String> testBeverageMenu = new ArrayList<String>();
    testBeverageMenu.add("soda");
    List<String> testEntertainmentMenu = new ArrayList<String>();
    testEntertainmentMenu.add("games");
    Event testEvent = new Event(testNumGuests, testFoodMenu, testBeverageMenu, testEntertainmentMenu);
    assertEquals(testEntertainmentMenu, testEvent.getEntertainment());
  }

  @Test
  public void calculateCost_usingOneItemPerCategory_30Point28() {
    int testNumGuests = 1;
    List<String> testFoodMenu = new ArrayList<String>();
    testFoodMenu.add("pizza");
    List<String> testBeverageMenu = new ArrayList<String>();
    testBeverageMenu.add("soda");
    List<String> testEntertainmentMenu = new ArrayList<String>();
    testEntertainmentMenu.add("games");
    Event testEvent = new Event(testNumGuests, testFoodMenu, testBeverageMenu, testEntertainmentMenu);
    assertEquals(30.28, testEvent.calculateCost(), 0.01);
  }
}
