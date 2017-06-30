class Event {
  private int mNumberOfGuests;
  private String[] mFoodMenu = {"Salmon Burgers", "Tortilla Pizza", "Cod with a Crab and Herb Crust", "Chermoula Chicken", "Mango Lime Tarts", "Cherry Crumble", "Classic New York Cheesecake"; "Raspberry Crisp", "Lavender Cake"};
  private String[] mBeveragesMenu = {"Coffee", "Tea", "Wine", "Soda","Full Bar"};
  private String[] mEntertainmentMenu = {"Live Band", "Games", "Dancing"};
  private List<String> mFood = new ArrayList<String>();
  private List<String> mBeverages= new ArrayList<String>();
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

  public 

  public Event(int numberOfGuests, List<String> food, List<String> beverages, List<String> entertainment) {
    mNumberOfGuests = numberOfGuests;

    for (Integer index = 0 ; index < food.length ; index++) {
      mFood[index] = food[index];
    }

    for (Integer index = 0 ; index < beverages.length ; index++) {
      mBeverages[index] = beverages[index];
    }

    for (Integer index = 0 ; index < entertainment.length ; index++) {
      mEntertainment[index] = entertainment[index];
    }
  }
}
