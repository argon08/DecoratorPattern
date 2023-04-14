package allabouttea;

/**
 * It represents a concrete decorator of taro for a Tea object.
 */
public class TaroDec extends ToppingDecorator implements Tea {

  public TaroDec(Tea tea) {
    super(tea);
    this.name = "taro";
  }

  @Override
  public double getPrice(){
    return tea.getPrice() + 1.5;
  }
}
