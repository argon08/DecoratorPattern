package allabouttea;

public class BlackPearlDec extends ToppingDecorator implements Tea{

  public BlackPearlDec(Tea tea){
    this.tea = tea;
    this.price = 0.6;
  }

  @Override
  public String getName(){
    return tea.getName() + ", black Pearl";
  }


}
