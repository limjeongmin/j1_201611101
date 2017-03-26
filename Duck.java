package headfirst.strategy;

public abstract class Duck {
 FlyBehavior flyBehavior;
 QuackBehavior quackBehavior;
 
 public Duck() {
 }
 
 public void setFlyBehavior (FlyBehavior fb) {
  flyBehavior = fb;
 }
 
 public void setQuackBehavior(QuackBehavior qb) {
  quackBehavior = qb;
 }
 
 abstract void display();
 
 public void performFly() {
  System.out.println("fly with wings");
    flyBehavior.fly();
 }
 public void performQuack() {
   System.out.println("Ducks Quack!");
   quackBehavior.quack();
 }
 
 public void swim() {
  System.out.println("All ducks float, even decoys!");
}
}