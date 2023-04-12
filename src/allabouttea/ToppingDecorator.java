package allabouttea;

/**
 * This represents an abstract class of decorator for a Tea object.
 */
public abstract class ToppingDecorator implements Tea {

  Tea tea;
  String name;
  double price;

  @Override public String getName(){
    return tea.getName() + ", " + name;
  }

  @Override public double getPrice() {
    return tea.getPrice() + price;
  }

}
