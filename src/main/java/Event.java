import java.util.List;
import java.util.ArrayList;

class Event {
  private int mNumberOfGuests;
  // private String[] mFoodMenu = {"Salmon Burgers", "Tortilla Pizza", "Cod with a Crab and Herb Crust", "Chermoula Chicken", "Mango Lime Tarts", "Cherry Crumble", "Classic New York Cheesecake", "Raspberry Crisp", "Lavender Cake"};
  // private String[] mBeveragesMenu = {"Coffee", "Tea", "Wine", "Soda","Full Bar"};
  // private String[] mEntertainmentMenu = {"Live Band", "Games", "Dancing"};


  private List<String> mFood = new ArrayList<String>();
  private List<String> mBeverages = new ArrayList<String>();
  private List<String> mEntertainment = new ArrayList<String>();

  public int getNumberOfGuests() {
    return mNumberOfGuests;
  }

  public List<String> getFood() {
    return mFood;
  }

  public List<String> getBeverages() {
    return mBeverages;
  }

  public List<String> getEntertainment() {
    return mEntertainment;
  }

  public Event(int numberOfGuests, List<String> food, List<String> beverages, List<String> entertainment) {
    mNumberOfGuests = numberOfGuests;
    mFood.addAll(food);
    mBeverages.addAll(beverages);
    mEntertainment.addAll(entertainment);
  }

  public double calculateCost() {
    double costOfEntertainment;
    double costOfFood = 10.50 * mFood.size();
    double costOfBeverages = 2.00 * mBeverages.size();

    if (mEntertainment.equals("None")) {
      costOfEntertainment = 0.00;
    } else {
      costOfEntertainment = 15.00 * mEntertainment.size();
    }

    double costOfFoodBeveragesEntertainment = costOfFood + costOfBeverages + costOfEntertainment;
    double totalCost = mNumberOfGuests * costOfFoodBeveragesEntertainment * 1.101;
    return totalCost;
  }

}
