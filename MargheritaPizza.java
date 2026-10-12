public class MargheritaPizza extends Pizza {

  //The variables
  private int numTomatoes;
  private boolean hasBasil;
  private boolean hasOliveOil;

  //The no-argument constructor
  public MargheritaPizza() {
    numTomatoes = 5;
    hasBasil = true;
    hasOliveOil = true;
  }

  /*
  * The parameterized constructor
  * Includes all the different variables, including the ones from the super class
  */
  public MargheritaPizza(boolean hasCheese, boolean hasSauce, double price, int numTomatoes, boolean hasBasil, boolean hasOliveOil) {
    super(hasCheese, hasSauce, price);
    this.numTomatoes = numTomatoes;
    this.hasBasil = hasBasil;
    this.hasOliveOil = hasOliveOil;
  }

  //The accessor methods
  public int getNumTomatoes() {
    return numTomatoes;
  }

  public boolean getHasBasil() {
    return hasBasil;
  }

  public boolean getHasOliveOil() {
    return hasOliveOil;
  }

  //The mutator methods
  public void setNumTomatoes(int numTomatoes) {
    this.numTomatoes = numTomatoes;
  }

  public void setHasBasil(boolean hasBasil) {
    this.hasBasil = hasBasil;
  }

  public void setHasOliveOil(boolean hasOliveOil) {
    this.hasOliveOil = hasOliveOil;
  }

  //The toString method
  public String toString() {
    return "\nMargherita Pizza:\n" + super.toString() + "\nThe Number of Tomatoes on Your Pizza is: " + numTomatoes + "\nYour Pizza Has Basil: " + hasBasil + "\nYour Pizza has Olive Oil: " + hasOliveOil;
  }
  
}