package com.sd.hw.mid;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class AdbookListener implements ActionListener{
  public void actionPerformed(ActionEvent e){
    System.out.println("Hello");
    JButton b=(JButton)e.getSource();
    String cmd= e.getActionCommand();
    if(cmd.equals("�Է�")){
      System.out.println("�Է¹�ư");
      SorterMain sort=new SorterMain();
      
      b.setText("�Է��߽��ϴ�.");
    }
  }
}