package allabouttea;

/**
 * It represents a concrete decorator of black pearl for a Tea object.
 */
public class BlackPearlDec extends ToppingDecorator implements Tea {

  public BlackPearlDec(Tea tea) {
    super(tea);
    this.name = "black pearl";
  }

  @Override
  public double getPrice(){
    return tea.getPrice() + 0.6;
  }
}
