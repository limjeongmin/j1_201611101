package com.sd.hw.fin;
import javax.swing.*;
public class InsertCommand implements Command {
 
 PersonDAO dao;
 PersonVO person;
 public InsertCommand(PersonDAO dao,PersonVO person){
  
  this.dao = dao;
  this.person = person;
 }
 
 public void execute(){
  dao.insert(this.person);
 
 }
}
