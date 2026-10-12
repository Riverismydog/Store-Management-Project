import java.util.Scanner;

public class StoreRunner {
  public static void main(String[] args) {

    // Creates a Scanner object - feel free to delete if not using!
    Scanner input = new Scanner(System.in);

    /*
    * These are the constructors for the pizzas
    * It also includes the scanner methods that get your responses for each pizza
    */
    Pizza i = new Pizza();
    System.out.println("Does Your Pizza Have Cheese?");
    i.setHasCheese(input.nextBoolean());
    System.out.println("Does Your Pizza Have Sauce?");
    i.setHasSauce(input.nextBoolean());
    System.out.println("What is the Price of Your Pizza?");
    i.setPrice(input.nextDouble());
    System.out.println(i.toString());
    
    MargheritaPizza ye = new MargheritaPizza();
    System.out.println("Does Your Pizza Have Cheese?");
    ye.setHasCheese(input.nextBoolean());
    System.out.println("Does Your Pizza Have Sauce?");
    ye.setHasSauce(input.nextBoolean());
    System.out.println("How Many Tomatoes Does Your Pizza Have?");
    ye.setNumTomatoes(input.nextInt());
    System.out.println("Does Your Pizza Have Basil?");
    ye.setHasBasil(input.nextBoolean());
    System.out.println("Does Your Pizza Have Olive Oil?");
    ye.setHasOliveOil(input.nextBoolean());
    System.out.println("What is the Price of Your Pizza?");
    ye.setPrice(input.nextDouble());
    System.out.println(ye.toString());

    MeatPizza meat = new MeatPizza();
    System.out.println("Does Your Pizza Have Cheese?");
    meat.setHasCheese(input.nextBoolean());
    System.out.println("Does Your Pizza Have Sauce?");
    meat.setHasSauce(input.nextBoolean());
    System.out.println("Does Your Pizza Have Sausage?");
    meat.setHasSausage(input.nextBoolean());
    System.out.println("Does Your Pizza Have Chicken?");
    meat.setHasChicken(input.nextBoolean());
    System.out.println("What is the Price of Your Pizza?");
    meat.setPrice(input.nextDouble());
    System.out.println(meat.toString());

    
    // Closes the Scanner object
    input.close();
    
  }
}