package headfirst.command.undo;
//null object 패턴,아무것도 안하는 클래스 
public class NoCommand implements Command{
  public void execute() { }
    public void undo() { }
}