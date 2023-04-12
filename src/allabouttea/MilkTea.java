package allabouttea;

public class MilkTea extends AbstractTea implements Tea{

  public MilkTea(String description, SugarLevel sugar, double cost){
    this.description = description;
    this.sugar = sugar;
    this.price = cost;
  }

}
