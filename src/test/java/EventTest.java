import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class EventTest {

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
