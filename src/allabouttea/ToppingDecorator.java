package allabouttea;

/**
 * This represents an abstract class of decorator for a Tea object.
 */
public abstract class ToppingDecorator implements Tea {

  protected Tea tea;
  protected String name;

  public ToppingDecorator(Tea tea){
    this.tea = tea;
  }
  @Override public String getName(){
    return tea.getName() + ", " + name;
  }

  @Override public abstract double getPrice();

}
