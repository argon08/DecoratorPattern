package allabouttea;

public class TaroDec extends ToppingDecorator implements Tea{

  public TaroDec(Tea tea){
    this.tea = tea;
    this.price = 1.5;
  }

  @Override
  public String getName(){
    return tea.getName() + ", taro";
  }

}
