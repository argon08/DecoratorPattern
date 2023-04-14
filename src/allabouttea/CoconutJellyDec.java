package allabouttea;

/**
 * It represents a concrete decorator of coconut jelly for a Tea object.
 */
public class CoconutJellyDec extends ToppingDecorator implements Tea {

  public CoconutJellyDec(Tea tea) {
    super(tea);
    this.name = "coconut jelly";
  }

  @Override
  public double getPrice(){
    return tea.getPrice() + 0.7;
  }
}
