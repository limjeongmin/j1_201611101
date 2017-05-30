package com.sd.dao.v0;

import java.sql.*;
import java.util.Properties;
import java.io.*;

public class DaoMainV0{
  public static void main(String[] args){
    Connection conn = null;
    Statement stmt = null;
    ResultSet rs=null;
    try {
      String path = System.getProperty("user.dir");
      path += "\\src\\mysql.properties";
      Properties prop = new Properties();
      prop.load(new FileInputStream(path));
      Class.forName("com.mysql.jdbc.Driver");
      conn = DriverManager.getConnection(
         prop.getProperty("URL"),
         prop.getProperty("USER"),
         prop.getProperty("PASSWORD")
       );
      //String mySql = "CREATE TABLE persons(id int(64) NOT NULL AUTO_INCREMENT,";
      //mySql+="name varchar(255) NOT NULL, address varchar(255) NOT NULL, UNIQUE (id))";
      String mysql="select name from persons where id<4 order by id";
      stmt=conn.createStatement();
      //stmt.execute(mySql);
      rs=stmt.executeQuery(mysql);
      //ResultSet rs=stmt.executeQuery(mysql);
      while(rs.next()){
        System.out.println(rs.getString("name"));
      }
      
    } catch (Exception e){
      e.printStackTrace();
    } finally{
      try{
        if(rs!=null)rs.close();
        if(stmt != null) stmt.close();
        if(conn != null) conn.close();
      } catch (Exception e){};
    }
  }
}
