package allabouttea;

/**
 * This represents an abstract class that implements the Tea interface.
 */
public abstract class AbstractTea implements Tea {

  SugarLevel sugar;
  String description;
  double price;

  @Override public String getName() {
    return description + " - " + sugar.toString() + " sugar";
  }

  @Override public double getPrice() {
    return price;
  }
}
