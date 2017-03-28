package com.sd.sort.v0;

public class SorterMainV0 {
    public static void main(String[] args) {
        String[] B={"John", "Adam", "Skrien", "Smith", "Jones"};
        sort(B);

        Integer[] C = {new Integer(3), new Integer(1), new Integer(4), new Integer(2)};
        sort(C);

        for(int i=0; i<B.length; i++)
            System.out.println("B["+i+"]="+B[i]);
        for(int i=0; i<C.length; i++)
            System.out.println("C["+i+"]="+C[i]);
    }
}
 