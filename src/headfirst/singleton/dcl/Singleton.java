package headfirst.singleton.dcl;

public class Singleton{
  //static쓰면 데이터가 잔존됨 .
  //thread는 캐시메모리 사용.
  //volatile 캐시메모리랑 메인메모리와 동기화를  시켜주는 명령어.
  private volatile static Singleton uniqueInstance=new Singleton();
  private static int numCalled=0;
  
  private void Singleton(){
  }
  public static Singleton getInstance(){
    if(uniqueInstance==null){
      //synchronized 만들기.
      synchronized(Singleton.class){
        if(uniqueInstance==null){
          System.out.println("creating...");
          uniqueInstance =new Singleton();
          //private자기자신은 new가능
        }
      }
    }
    //else{
      System.out.println("returning...");
      System.out.println("num called..."+numCalled++);
      return uniqueInstance;
    //}instance 있으면 돌려주고 없으면 만들고.
  }
}
