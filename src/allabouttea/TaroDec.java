package allabouttea;

/**
 * It represents a concrete decorator of taro for a Tea object.
 */
public class TaroDec extends ToppingDecorator implements Tea {

  public TaroDec(Tea tea) {
    this.name = "taro";
    this.tea = tea;
    this.price = 1.5;
  }

}
