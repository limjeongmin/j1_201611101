package com.sd.dao.v2;
//value object>> vo=RDB Talbe

public class PersonVO {
    private int id;
    private String name;
    private String address;
    
   // Person(int id, String name){
   //     this.id=id;
   //     this.name=name;
   // }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name=name;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id=id;
    }
    public void setAddress(String address){
      this.address=address;
    }
    public String getAddress(){
      return address;
    }
    public String toString(){
      return "ID: "+id+"Name: "+name+"Address"+address;
    }
}