package allabouttea;

/**
 * It represents a concrete decorator of coconut jelly for a Tea object.
 */
public class CoconutJellyDec extends ToppingDecorator implements Tea {

  public CoconutJellyDec(Tea tea) {
    this.name = "coconut jelly";
    this.tea = tea;
    this.price = 1.0;
  }
}
