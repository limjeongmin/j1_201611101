package headfirst.iterator.dinermerger.before;

import java.util.ArrayList;

public class PancakeHouseMenu{
  ArrayList menuItems;

  public PancakeHouseMenu(){
    menuItems=new ArrayList();
    
    addItem("Pancake","Banana Pancake",true,2.99);
    addItem("Waffles","sweet Waffles", false, 3.29);
  }
  public void addItem(String n,String d,boolean v,double p){
    MenuItem menuItem=new MenuItem(n,d,v,p);
    menuItems.add(menuItem);
  }
  public ArrayList getMenuItems(){
    return menuItems;
  }
}