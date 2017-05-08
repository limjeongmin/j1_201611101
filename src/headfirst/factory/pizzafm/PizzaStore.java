package headfirst.factory.pizzafm;

public abstract class PizzaStore{
  abstract Pizza createPizza(String  item);
  
  public Pizza orderPizza(String type){
    Pizza pizza;
    //pizza=factory.createPizza(type);//factoy�� Ư¡�� ������.
    pizza=createPizza(type);
    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();
    return pizza;
  }
}