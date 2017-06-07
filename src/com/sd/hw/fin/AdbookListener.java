package com.sd.hw.fin;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.TextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
public class AdbookListener implements ActionListener{
 
 ActionController ac = new ActionController(); //Command pattern Controller;
 PersonDAO dao = new PersonDAOImpl();
 PersonVO person;
 JTextField name;
 JTextField tel;
 JTextField address;
 DefaultTableModel tablemodel;
 JTable table;
 public AdbookListener(JTable table,JTextField name, JTextField tel, JTextField address,DefaultTableModel tablemodel){
   this.name = name;
   this.tel = tel;
   this.address = address;
   this.tablemodel = tablemodel;
   this.table= table;
 }
 
 public void actionPerformed(ActionEvent e){  
    JButton b=(JButton)e.getSource();
    
    String cmd = e.getActionCommand();
    
    if(cmd.equals("add")){
     String name = this.name.getText();
     String tel = this.tel.getText();
     String address = this.address.getText();
     person = new PersonVO(name,tel,address);
     Command insert = new InsertCommand(dao,person);
     ac.setAction(insert);  // settin Command
     
     tablemodel.addRow(new String[] {person.getName(),person.getTel(),person.getAddress()});
     
     
    }else if (cmd.equals("delete")){
    // PersonVO p = AdbookGUI.personList.get(table.getSelectedRow());
     int row = table.getSelectedRow();
     String id = table.getModel().getValueAt(row, 0).toString();
     
     Command delete = new DeleteCommand(dao,id);
     ac.setAction(delete);
     //System.out.println("row is"+p.getName());
     tablemodel.removeRow(table.getSelectedRow());
     
    }
    
    ac.executeAction();
    
  }
}