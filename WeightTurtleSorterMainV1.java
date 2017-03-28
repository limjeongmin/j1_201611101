package com.sd.sort.v1;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class WeightTurtleSorterMainV1 {
    public static void main(String[] args) {
        List<WeightTurtleComparable> l=new ArrayList<WeightTurtleComparable>();
        WeightTurtleComparable wt10 = new WeightTurtleComparable(10);
        WeightTurtleComparable wt15 = new WeightTurtleComparable(15);
        l.add(wt10);
        l.add(wt15);
        Collections.sort(l);
        System.out.println("after sorting: "+l);
    }
}
