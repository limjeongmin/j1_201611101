package headfirst.singleton.dcl;

public class Singleton{
  //static���� �����Ͱ� ������ .
  //thread�� ĳ�ø޸� ���.
  //volatile ĳ�ø޸𸮶� ���θ޸𸮿� ����ȭ��  �����ִ� ��ɾ�.
  private volatile static Singleton uniqueInstance=new Singleton();
  private static int numCalled=0;
  
  private void Singleton(){
  }
  public static Singleton getInstance(){
    if(uniqueInstance==null){
      //synchronized �����.
      synchronized(Singleton.class){
        if(uniqueInstance==null){
          System.out.println("creating...");
          uniqueInstance =new Singleton();
          //private�ڱ��ڽ��� new����
        }
      }
    }
    //else{
      System.out.println("returning...");
      System.out.println("num called..."+numCalled++);
      return uniqueInstance;
    //}instance ������ �����ְ� ������ �����.
  }
}
