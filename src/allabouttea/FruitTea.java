package allabouttea;

/**
 * This represents a concrete fruit tea class of the AbstractTea class.
 */
public class FruitTea extends AbstractTea implements Tea {

  /**
   * Constructs a new FruitTea object with the given description, sugar level, and price.
   * @param description the name of the tea
   * @param sugar the sugar level of the tea
   * @param cost the price of the tea
   */
  public FruitTea(String description, SugarLevel sugar, double cost) {
    this.description = description;
    this.sugar = sugar;
    this.price = cost;
  }

}
