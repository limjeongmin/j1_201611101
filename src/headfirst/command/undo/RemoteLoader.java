package headfirst.command.undo;

public class RemoteLoader {
 
 public static void main(String[] args) {
  RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();
 
  Light light = new Light();
 
  LightOnCommand lighton = new LightOnCommand(light);
  LightOffCommand lightoff = new LightOffCommand(light);
 
  remoteControl.setCommand(0, lighton,lightoff);
 
  remoteControl.onButtonWasPushed(0);
  remoteControl.offButtonWasPushed(0);
  remoteControl.undoButtonWasPushed();
  remoteControl.offButtonWasPushed(0);
  remoteControl.onButtonWasPushed(0);
  remoteControl.undoButtonWasPushed();
  
  Dvd dvd = new Dvd();
 
  DvdOnCommand dvdon = new DvdOnCommand(dvd);
  DvdOffCommand dvdoff = new DvdOffCommand(dvd);
 
  remoteControl.setCommand(0, dvdon,dvdoff);
 
  remoteControl.onButtonWasPushed(0);
  remoteControl.offButtonWasPushed(0);
  remoteControl.undoButtonWasPushed();
  remoteControl.offButtonWasPushed(0);
  remoteControl.onButtonWasPushed(0);
  remoteControl.undoButtonWasPushed();
 }
}