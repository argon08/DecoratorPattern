package allabouttea;

/**
 * It represents a concrete decorator of black pearl for a Tea object.
 */
public class BlackPearlDec extends ToppingDecorator implements Tea {

  public BlackPearlDec(Tea tea) {
    this.name = "black pearl";
    this.tea = tea;
    this.price = 0.6;
  }
}
