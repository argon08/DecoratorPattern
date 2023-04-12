package allabouttea;

/**
 * It represents a generic type of tea that can be ordered.
 */
public interface Tea {

  /**
   * Get the name of the tea or topping.
   * @return the name
   */
  String getName();

  /**
   * Get the price of the tea.
   * @return the price
   */
  double getPrice();
}
