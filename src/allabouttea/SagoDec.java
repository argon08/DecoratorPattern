package allabouttea;

/**
 * It represents a concrete decorator of sago for a Tea object.
 */
public class SagoDec extends ToppingDecorator implements Tea {

  public SagoDec(Tea tea) {
    this.name = "sago";
    this.tea = tea;
    this.price = 0.5;
  }

}
