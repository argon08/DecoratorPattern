package allabouttea;

/**
 * It represents a concrete decorator of sago for a Tea object.
 */
public class SagoDec extends ToppingDecorator implements Tea {

  public SagoDec(Tea tea) {
    super(tea);
    this.name = "sago";
  }

  @Override
  public double getPrice(){
    return tea.getPrice() + 0.5;
  }
}
