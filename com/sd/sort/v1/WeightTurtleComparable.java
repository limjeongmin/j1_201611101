package com.sd.sort.v1;

import com.sd.turtle.WeightTurtle;
import ch.aplu.turtle.*;
import java.awt.Color;

public class WeightTurtleComparable
   extends Turtle 
   implements Comparable<WeightTurtleComparable> {
   protected int weight;
   public WeightTurtleComparable(int w) {
       weight=w;
       setColor(Color.red);
       setPenColor(Color.red);
   }
   public int getWeight() {
       return weight;
   }
   public int compareTo(WeightTurtleComparable wt) {
       return this.getWeight() - wt.getWeight(); 
   }
}