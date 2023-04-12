package allabouttea;

/**
 * This represents the driver class for managing and printing receipts for tea order.
 */
public class Order {

  public static void printReceipt(Tea tea) {
    System.out.println(tea.getName() + "\n$" + tea.getPrice());
    System.out.println("-------------");
  }

  /**
   * The main method demonstrates three different orders of tea and their toppings.
   * @param args Command line arguments (not used).
   */
  public static void main(String[] args) {

    // Order 1: brown sugar milk tea
    Tea sugarMilkTea = new MilkTea("Brown Sugar Milk Tea", SugarLevel.FULL, 6.6);
    sugarMilkTea = new BlackPearlDec(sugarMilkTea);
    sugarMilkTea = new TaroDec(sugarMilkTea);
    printReceipt(sugarMilkTea);

    // Order 2: mango green tea
    Tea mango = new FruitTea("Mongo Green Tea", SugarLevel.HALF, 6.0);
    mango = new SagoDec(mango);
    mango = new CoconutJellyDec(mango);
    printReceipt(mango);

    // Order 3: black tea
    Tea black = new FreshTea("Black Tea", SugarLevel.LESS, 4.5);
    printReceipt(black);
  }
}
