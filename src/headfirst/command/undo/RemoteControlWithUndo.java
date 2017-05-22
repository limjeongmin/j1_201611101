package headfirst.command.undo;

import java.util.*;

public class RemoteControlWithUndo {
 //Command slot;
  Command[] onCommands;
  Command[] offCommands;
  Command undoCommand;
  
  public RemoteControlWithUndo(){
    onCommands=new Command[7];
    offCommands=new Command[7];
    //Null object Parttern
    Command noCommand=new NoCommand();
    for(int i=0; i<7;i++){
      onCommands[i]=noCommand;
      offCommands[i]=noCommand;
    }
    undoCommand=noCommand;
  }
  public void setCommand(int slot,Command onCommand,Command offCommand) {
    //slot = c;
    onCommands[slot]=onCommand;
    offCommands[slot]=offCommand;
  }
 
  public void onButtonWasPushed(int slot) {
    //slot.execute();
    onCommands[slot].execute();
    undoCommand=onCommands[slot];
  }
   public void offButtonWasPushed(int slot) {
    //slot.execute();
    onCommands[slot].execute();
    undoCommand=onCommands[slot];
  }
  public void undoButtonWasPushed(){
    undoCommand.undo();
  }
 }