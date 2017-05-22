package headfirst.iterator.dinermerger.before;

import java.util.*;

public class MenuTestDrive {
    public static void main(String args[]) {
    PancakeHouseMenu pancake = new PancakeHouseMenu();
    DinerMenu diner = new DinerMenu();
 
    printMenu();
    }
    public static void printMenu() {
        PancakeHouseMenu pancake = new PancakeHouseMenu();
        DinerMenu diner = new DinerMenu();

        ArrayList breakfastItems = pancake.getMenuItems();

        for (int i = 0; i < breakfastItems.size(); i++) {
            MenuItem menuItem = (MenuItem)breakfastItems.get(i);
            System.out.print(menuItem.getName());
            System.out.println("\t\t" + menuItem.getPrice());
            System.out.println("\t" + menuItem.getDescription());
        }

        MenuItem[] lunchItems = diner.getMenuItems();

        for (int i = 0; i < lunchItems.length; i++) {
            MenuItem menuItem = lunchItems[i];
            System.out.print(menuItem.getName());
            System.out.println("\t\t" + menuItem.getPrice());
            System.out.println("\t" + menuItem.getDescription());
        }
    }
}