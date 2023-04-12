package allabouttea;

public class FreshTea extends AbstractTea implements Tea{

  public FreshTea(String description, SugarLevel sugar, double cost) {
    this.description = description;
    this.sugar = sugar;
    this.price = cost;
  }

}
