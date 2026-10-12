public class Pizza {

  //The variables
  private boolean hasCheese;
  private boolean hasSauce;
  private double price;

  //The no-argument constructor
  public Pizza() {
    hasCheese = true;
    hasSauce = true;
    price = 11.99;
  }

  /*
  * The parameterized constructor
  * Includes all the different variables
  */
  public Pizza(boolean hasCheese, boolean hasSauce, double price) {
    this.hasCheese = hasCheese;
    this.hasSauce = hasSauce;
    this.price = price;
  }

  //The accessor methods
  public boolean getHasCheese() {
    return hasCheese;
  }
  
  public boolean getHasSauce() {
    return hasSauce;
  }

  public double getPrice() {
    return price;
  }

  //The mutator methods
  public void setHasCheese(boolean hasCheese) {
    this.hasCheese = hasCheese;
  }

  public void setHasSauce(boolean hasSauce) {
    this.hasSauce = hasSauce;
  }

  public void setPrice(double price) {
    this.price = price;
  }
  
  //The toString method
  public String toString() {
    return "Your Pizza has Cheese: " + hasCheese +"\nYour Pizza has Sauce: " + hasSauce + "\nThe Price of Your Pizza is: " + price;
  }
  
}