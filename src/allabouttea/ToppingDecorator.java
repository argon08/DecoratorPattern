package allabouttea;

public abstract class ToppingDecorator implements Tea{

  Tea tea;
  String name;
  double price;

  @Override
  public abstract String getName();

  @Override
  public double getPrice(){
    return tea.getPrice() + price;
  }

}
