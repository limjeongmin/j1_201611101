package com.sd.hw.mid;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class AdbookListener implements ActionListener{
  public void actionPerformed(ActionEvent e){
    System.out.println("Hello");
    JButton b=(JButton)e.getSource();
    String cmd= e.getActionCommand();
    if(cmd.equals("입력")){
      System.out.println("입력버튼");
      SorterMain sort=new SorterMain();
      
      b.setText("입력했습니다.");
    }
  }
}