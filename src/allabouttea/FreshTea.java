package allabouttea;

/**
 * This represents a concrete fresh tea class of the AbstractTea class.
 */
public class FreshTea extends AbstractTea implements Tea {

  /**
   * Constructs a new FreshTea object with the given description, sugar level, and price.
   * @param description the name of the tea
   * @param sugar the sugar level of the tea
   * @param cost the price of the tea
   */
  public FreshTea(String description, SugarLevel sugar, double cost) {
    this.description = description;
    this.sugar = sugar;
    this.price = cost;
  }

}
