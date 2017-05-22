package headfirst.command.undo;

public class Dvd {
  int level;
  
 public Dvd() {
 }

 public void on() {
   level=100;
  System.out.println("Dvd is On");
 }

 public void off() {
   level=0;
  System.out.println("Dvd is off");
 }

 public int getLevel(){
   return level;
 }
 public void dim(int level){
   this.level=level;
 }
}