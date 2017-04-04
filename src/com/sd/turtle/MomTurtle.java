package com.sd.turtle;

import java.util.Observer;
import java.util.Observable;
import java.awt.geom.Point2D.Double;
import ch.aplu.turtle.*;

public class MomTurtle extends Turtle implements Observer{
  Double babyCurpos;
  public MomTurtle(){
    label("mom turtle");
  }
  public void update(Observable o,Object arg){
    babyCurpos = ((BabyTurtle)o).myCurpos;
    moveTo(babyCurpos);
  }
}