package com.sd.hw.fin;

public class PersonVO {
 private int id;
 private String name;
 private String address;
 private String tel;
 
 PersonVO(){
  
 }
 PersonVO(String name, String tel,String address){
  this.name = name;
  this.address = address;
  this.tel = tel;
 }
 
 public String getTel() {
  return tel;
 }

 public void setTel(String tel) {
  this.tel = tel;
 }
 
 
 
 public int getId() {
  return id;
 }
 public void setId(int id) {
  this.id = id;
 }
 public String getName() {
  return name;
 }
 public void setName(String name) {
  this.name = name;
 }
 public String getAddress() {
  return address;
 }
 public void setAddress(String address) {
  this.address = address;
 }
 
 
}
