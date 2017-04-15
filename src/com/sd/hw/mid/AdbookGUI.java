package com.sd.hw.mid;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;


public class AdbookGUI extends JFrame{
  public static void main(String[] args){
    JFrame f=new JFrame();
    
      JPanel pan=new JPanel();
      pan.setLayout(new GridLayout(4,2));
      f.getContentPane().add(pan);
      
      JLabel l1=new JLabel("이   름");
      JLabel l2=new JLabel("전화번호");
      JLabel l3=new JLabel("주   소");
      
      
      JTextField f1=new JTextField(30);
      JTextField f2=new JTextField(30);
      JTextField f3=new JTextField(30);
      
      JButton b1=new JButton("입력");
      JButton b2=new JButton("취소");
      
      b1.addActionListener(new AdbookListener());
      b2.addActionListener(new AdbookListener());
      

      
      pan.add(l1);
      pan.add(f1);
      pan.add(l2);
      pan.add(f2);
      pan.add(l3);
      pan.add(f3);
      pan.add(b1);
      pan.add(b2);
      f.pack();
      f.setVisible(true);
  }
   
}
  