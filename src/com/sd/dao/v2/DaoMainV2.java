package com.sd.dao.v2;

import java.util.List;
import java.util.Iterator;

public class DaoMainV2 {
    public static void main(String args[]){
        PersonDaoImpl pdl  = new PersonDaoImpl();
        PersonVO p = new PersonVO();

        p.setName("ljm1");
        p.setAddress("1 Honeundong");
        pdl.insert(p);

        p.setName("ljm2");
        p.setAddress("2 Hongeundong");
        pdl.insert(p);

        List persons=pdl.findAll();
        Iterator iter=persons.iterator();
        while(iter.hasNext()) {
            p=(PersonVO)iter.next();
            System.out.println(p.toString());
        }

        pdl.delete(1);

        p.setId(2);
        p.setName("ljm2 updated");
        p.setAddress("2 Hongdundong updated");
        pdl.update(p);

        p=pdl.findById(2);
        System.out.println("found by id..."+p);

        pdl.close();
    }
}