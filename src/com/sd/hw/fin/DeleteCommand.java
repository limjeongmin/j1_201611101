package com.sd.hw.fin;
import javax.swing.*;
public class DeleteCommand implements Command{
 PersonDAO dao;
 String id;
 
 
 public DeleteCommand(PersonDAO dao,String id){
  this.dao = dao;
  this.id = id;
 
 }
 
 
 
 public void execute(){
   dao.delete(Integer.parseInt(id));
 }

}
