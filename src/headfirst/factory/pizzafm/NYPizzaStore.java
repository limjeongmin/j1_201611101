package headfirst.factory.pizzafm;

public class NYPizzaStore extends PizzaStore{
  Pizza createPizza(String  type){
    Pizza pizza=null;
    if(type.equals("NYStyleCheesePizza")){
      return new NYStyleCheesePizza();
    }
    return pizza;
  }
}