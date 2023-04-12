package allabouttea;

public class CoconutJellyDec extends ToppingDecorator implements Tea{

  public CoconutJellyDec(Tea tea){
    this.tea = tea;
    this.price = 1.0;
  }

  @Override
  public String getName(){
    return tea.getName() + ", coconut jelly";
  }
}
