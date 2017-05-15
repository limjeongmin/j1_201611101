package headfirst.singleton.threadsafe;

public class Singleton{
  //static쓰면 데이터가 잔존됨 .
  private static Singleton uniqueInstance;
  private static int numCalled=0;
  
  private Singleton(){
  }
  //classic과 다른점>Synchronized=사용중.
  public static synchronized Singleton getInstance(){
    if(uniqueInstance==null){
      System.out.println("creating...");
      uniqueInstance =new Singleton();
//private자기자신은 new가능
    }
    //else{
      System.out.println("returning...");
      System.out.println("num called..."+numCalled++);
      return uniqueInstance;
    //}instance 있으면 돌려주고 없으면 만들고.
  }  
}