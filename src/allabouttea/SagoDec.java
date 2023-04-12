package allabouttea;

public class SagoDec extends ToppingDecorator implements Tea{

  public SagoDec(Tea tea){
    this.tea = tea;
    this.price = 0.5;
  }

  @Override
  public String getName(){
    return tea.getName() + ", sago";
  }

}
