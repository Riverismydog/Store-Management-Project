public class MeatPizza extends Pizza {

  //The variables
  private boolean hasSausage;
  private boolean hasChicken;

  //The no-argument constructor
  public MeatPizza() {
    hasSausage = true;
    hasChicken = false;
  }

  /*
  * The parameterized constructor
  * Includes all the different variables, including the ones from the super class
  */
  public MeatPizza(boolean hasCheese, boolean hasSauce, double price, boolean hasSausage, boolean hasChicken) {
    super(hasCheese, hasSauce, price);
    this.hasSausage = hasSausage;
    this.hasChicken = hasChicken;
  }

  //The accessor methods
  public boolean getHasSausage() {
    return hasSausage;
  }

  public boolean getHasChicken() {
    return hasChicken;
  }

  //The mutator methods
  public void setHasSausage(boolean hasSausage) {
    this.hasSausage = hasSausage;
  }

  public void setHasChicken(boolean hasChicken) {
    this.hasChicken = hasChicken;
  }

  //The toString method
  public String toString() {
    return "\nMeat Pizza:\n" + super.toString() + "\nYour Pizza has Sausage: " + hasSausage + "\nYour Pizza has Chicken: " + hasChicken;
  }

}