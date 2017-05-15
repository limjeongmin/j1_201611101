package headfirst.singleton.chocolate;

public class ChocolateBoiler{
  //static쓰면 데이터가 잔존됨 .
  private boolean empty;
  private boolean boiled;
  private static ChocolateBoiler uniqueInstance;
  private static int numCalled=0;
  
  private void ChocolateBoiler(){
    empty= true;
    boiled=false;
  }
  public static ChocolateBoiler getInstance(){
    if(uniqueInstance==null){
      System.out.println("creating...");
      uniqueInstance =new ChocolateBoiler();
//private자기자신은 new가능
    }
    //else{
      System.out.println("returning...");
      System.out.println("num called..."+numCalled++);
      return uniqueInstance;
    //}instance 있으면 돌려주고 없으면 만들고.
  }
  public void fill(){
    if(isEmpty()){
      System.out.println("filling");
      empty=false;
      boiled=false;
    }
  }
  public void drain() {
  if (!isEmpty() && isBoiled()) {
   // drain the boiled milk and chocolate
   empty = true;
  }
 }
  public void boil() {
  if (!isEmpty() && !isBoiled()) {
   // bring the contents to a boil
   boiled = true;
  }
 }
  
  public boolean isEmpty(){
    return empty;
  }
  public boolean isBoiled() {
  return boiled;
 }
  
}


