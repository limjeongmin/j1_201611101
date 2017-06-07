package com.sd.hw.fin;

public class ActionController {
 Command action;
 
 public ActionController(){
  
 }
 
 public void setAction(Command action){
  this.action = action;
 }
 
 public void executeAction(){
  action.execute();
 }
}
