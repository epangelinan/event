import java.util.List;
import java.util.ArrayList;

class Event {
  private int mNumberOfGuests;
  private String[] mFoodMenu = {"Salmon Burgers", "Tortilla Pizza", "Cod with a Crab and Herb Crust", "Chermoula Chicken", "Mango Lime Tarts", "Cherry Crumble", "Classic New York Cheesecake", "Raspberry Crisp", "Lavender Cake"};
  private String[] mBeveragesMenu = {"Coffee", "Tea", "Wine", "Soda","Full Bar"};
  private String[] mEntertainmentMenu = {"Live Band", "Games", "Dancing"};
  //private List<String> mFood;
  //private List<String> mBeverages;
  //private List<String> mEntertainment;

  private List<String> mFood = new ArrayList<String>();
  private List<String> mBeverages = new ArrayList<String>();
  private List<String> mEntertainment = new ArrayList<String>();

  public int getNumberOfGuests() {
    return mNumberOfGuests;
  }

  public String[] getFoodMenu() {
    return mFoodMenu;
  }

  public String[] beveragesMenu() {
    return mBeveragesMenu;
  }

  public String[] entertainmentMenu() {
    return mEntertainmentMenu;
  }



  public Event(int numberOfGuests, List<String> food, List<String> beverages, List<String> entertainment) {
    mNumberOfGuests = numberOfGuests;
    String indexFood;
    String indexBeverages;
    String indexEntertainment;
    mFood.addAll(food);
    mBeverages.addAll(beverages);
    mEntertainment.addAll(entertainment);

    // for (Integer index = 0 ; index < food.length; index++) {
    //   indexFood = food[index];
    //   mFood[index] = indexFood;
    // }
    //
    // for (Integer index = 0 ; index < beverages.length; index++) {
    //   indexBeverages = beverages[index];
    //   mBeverages[index] = indexBeverages;
    // }
    //
    // for (Integer index = 0 ; index < entertainment.length; index++) {
    //   indexEntertainment= entertainment[index];
    //   mEntertainment[index] = indexEntertainment;
    // }
  }
}
