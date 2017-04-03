package com.sd.gui;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class CalcAreaListener implements ActionListener{
  public void actionPerformed(ActionEvent e){
    System.out.println("Hello");
    JButton b=(JButton)e.getSource();
    String cmd= e.getActionCommand();
    if(cmd.equals("계산")){
      System.out.println("계산버튼");
      b.setText("계산했습니다.");
    }
  }
}