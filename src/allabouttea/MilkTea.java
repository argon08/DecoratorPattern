package allabouttea;

/**
 * This represents a concrete milk tea class of the AbstractTea class.
 */
public class MilkTea extends AbstractTea implements Tea {

  /**
   * Constructs a new MilkTea object with the given description, sugar level, and price.
   * @param description the name of the tea
   * @param sugar the sugar level of the tea
   * @param cost the price of the tea
   */
  public MilkTea(String description, SugarLevel sugar, double cost) {
    this.description = description;
    this.sugar = sugar;
    this.price = cost;
  }

}
