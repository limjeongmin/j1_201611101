package headfirst.singleton.classic;

public class Singleton{
  //static���� �����Ͱ� ������ .
  private static Singleton uniqueInstance=new Singleton();
  private static int numCalled=0;
  
  private void Singleton(){
  }
  public static Singleton getInstance(){
    //if(uniqueInstance==null){
      //System.out.println("creating...");
      //uniqueInstance =new Singleton();
//private�ڱ��ڽ��� new����
    //}
    //else{
      System.out.println("returning...");
      System.out.println("num called..."+numCalled++);
      return uniqueInstance;
    //}instance ������ �����ְ� ������ �����.
  }  
}


