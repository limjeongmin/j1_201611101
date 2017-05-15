package headfirst.singleton.classic;

public class Singleton{
  //static쓰면 데이터가 잔존됨 .
  private static Singleton uniqueInstance=new Singleton();
  private static int numCalled=0;
  
  private void Singleton(){
  }
  public static Singleton getInstance(){
    //if(uniqueInstance==null){
      //System.out.println("creating...");
      //uniqueInstance =new Singleton();
//private자기자신은 new가능
    //}
    //else{
      System.out.println("returning...");
      System.out.println("num called..."+numCalled++);
      return uniqueInstance;
    //}instance 있으면 돌려주고 없으면 만들고.
  }  
}


