package com.sd.hw.mid;

public class SorterMain {
  
   SorterMain(){
       String[] B={"John", "Adam", "Skrien", "Smith", "Jones"};
       Comparator stringComp=new StringComparator();
       Sorter.sort(B, stringComp);

       Integer[] C = {new Integer(3), new Integer(1), new Integer(4), new Integer(2)};
       Comparator integerComp=new IntegerComparator();
       Sorter.sort(C, integerComp);
       
      for(int i=0; i<B.length; i++)
            System.out.println("B["+i+"]="+B[i]);
        for(int i=0; i<C.length; i++)
            System.out.println("C["+i+"]="+C[i]);

       
    }
 
}