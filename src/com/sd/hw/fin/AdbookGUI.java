//package com.sd.hw.fin;
//
//import java.awt.*;
//import java.awt.event.*;
//import javax.swing.*;
//import javax.swing.event.*;
//import java.util.*;
//import javax.swing.JScrollPane;
//import javax.swing.table.DefaultTableModel;
//
//
//public class AdbookGUI extends JFrame{
//  public static void main(String[] args){
//    
//    Dimension dim=new Dimension(1000,1000);
//
//    JFrame f=new JFrame("¡÷º“∑œ");
//    f.setSize(400,30);
//    f.setLocation(200,400);
//    f.setPreferredSize(dim);
//    
//    
//    
//      JPanel pan=new JPanel();
//    pan.setLayout(new GridLayout(4,2));
//    f.getContentPane().add(pan);
//      
//      JLabel l1=new JLabel("name");
//      JLabel l2=new JLabel("tel");
//      JLabel l3=new JLabel("adress");
//      l1.setHorizontalAlignment(SwingConstants.CENTER);
//      l2.setHorizontalAlignment(SwingConstants.CENTER);
//      l3.setHorizontalAlignment(SwingConstants.CENTER);
//      
//      JTextField f1=new JTextField(30);
//      JTextField f2=new JTextField(30);
//      JTextField f3=new JTextField(30);
//      
//      JButton b1=new JButton("input");
//      JButton b2=new JButton("delete");
//      
//      b1.addActionListener(new AdbookListener(f1,f2,f3));
//      b2.addActionListener(new AdbookListener(f1,f2,f3));
//      
//
//      
//      pan.add(l1);
//      pan.add(f1);
//      pan.add(l2);
//      pan.add(f2);
//      pan.add(l3);
//      pan.add(f3);
//      pan.add(b1);
//      pan.add(b2);
//      
//  JTable userTable;
////  JScrollPane listJs;
////  
////  
//    DefaultTableModel model;
//  Vector<String> userRow;
//  Vector<String> userColumn=new Vector<String>();
//    userColumn.addElement("Name");
//    userColumn.addElement("TEl");
//    userColumn.addElement("Address");   
//    model=new DefaultTableModel(userColumn,0);
//    userTable=new JTable(model);
//    userTable.setBounds(150,100,200,200);
//    pan.add(userTable);
////    
//     
////    setResizable(false);
////    
//    JPanel listPanel=new JPanel();
//    listPanel.setLayout(new BorderLayout());
//    JScrollPane listJs=new JScrollPane(userTable);
//    listPanel.add(listJs,BorderLayout.CENTER);
//    
//     //add(listPanel);
////    
////    setVisible(true);
////    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
//  
// 
//    //userTable.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
//    
//      f.pack();
//      f.setVisible(true);
//  }
//   
//}
//  


package com.sd.hw.fin;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;



import java.util.ArrayList;
import java.util.List;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
public class AdbookGUI extends JFrame{
 Label l1,l2,l3;
 JTextField tf1,tf2,tf3;
 JButton btn1,btn2;
 JTable table;
 JScrollPane scroll;
 DefaultTableModel tablemodel;
 PersonDAO dao;
 static List<PersonVO> personList;
 public AdbookGUI(){
   dao = new PersonDAOImpl();
   personList = dao.findAll();
   
   
  tablemodel = new DefaultTableModel();
  tablemodel.setColumnIdentifiers(new String[]{"id","name","tel","address"});
  
  for(int i = 0 ; i<personList.size();i++){
  
  tablemodel.addRow(new String[] {String.valueOf(personList.get(i).getId()),personList.get(i).getName(), personList.get(i).getTel(),personList.get(i).getAddress()});
  }
  table = new JTable(tablemodel);
  scroll = new JScrollPane(table);
  
  l1 = new Label("name");
  l2 = new Label("tel");
  l3 = new Label("address");
  
  tf1 = new JTextField(null,10);
  tf2 = new JTextField(null,10);
  tf3 = new JTextField(null,10);
  
  
  btn1=new JButton("add");
  btn1.addActionListener(new AdbookListener(table,tf1,tf2,tf3,tablemodel));
  btn2=new JButton("delete");
  btn2.addActionListener(new AdbookListener(table,tf1,tf2,tf3,tablemodel));


  Panel panel=new Panel(new FlowLayout());
  panel.add(l1);
  panel.add(tf1);
  panel.add(l2);
  panel.add(tf2);
  panel.add(l3);
  panel.add(tf3);
  panel.add(btn1);
  panel.add(btn2);
  
  getContentPane().add(panel, BorderLayout.SOUTH);
  getContentPane().add(table.getTableHeader(), BorderLayout.NORTH);
  getContentPane().add(scroll, BorderLayout.CENTER);
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  setSize(1000,300);
  setVisible(true);
  
  }
  
 public static void main(String[] args){
  new AdbookGUI();
 }
 
}