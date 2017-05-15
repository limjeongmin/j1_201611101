package headfirst.singleton.threadsafe;

public class Singleton{
  //static���� �����Ͱ� ������ .
  private static Singleton uniqueInstance;
  private static int numCalled=0;
  
  private Singleton(){
  }
  //classic�� �ٸ���>Synchronized=�����.
  public static synchronized Singleton getInstance(){
    if(uniqueInstance==null){
      System.out.println("creating...");
      uniqueInstance =new Singleton();
//private�ڱ��ڽ��� new����
    }
    //else{
      System.out.println("returning...");
      System.out.println("num called..."+numCalled++);
      return uniqueInstance;
    //}instance ������ �����ְ� ������ �����.
  }  
}