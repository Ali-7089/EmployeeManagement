package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class EmployeeDao {
    static Connection con;
   public static void insertEmployee(Employee empl){
       con = DBConnection.setConnection();
       String query = "insert into employees values(?,?,?,?)";
       try{
           PreparedStatement pstm = con.prepareStatement(query);
           pstm.setInt(1,empl.getId());
           pstm.setString(2,empl.getName());
           pstm.setInt(3,empl.getAge());
           pstm.setInt(4,empl.getSalary());
           int cnt = pstm.executeUpdate();
       }catch (Exception e){
           System.out.println(e);
       }
   }
   public static void fetchAllEmployees(){
       con = DBConnection.setConnection();
       try{
           String query = "select * from employees";
          Statement st = con.createStatement();
          ResultSet rs = st.executeQuery(query);
          while (rs.next()){
              System.out.println(rs.getInt(1) +" " +
                      ""+rs.getString(2)+" " +
                      ""+rs.getInt(3)+" "+
                      rs.getInt(4));
          }
       }catch (Exception e){
           System.out.println(e);
       }
   }
   public static void fetchEmployeeById(int id ){
       con = DBConnection.setConnection();
       try{
           String query = "select * from employees where id="+id;
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);
        while (rs.next()){
            System.out.println(rs.getInt(1)+ " " +
                    ""+rs.getString(2)+" "+
                    rs.getInt(3)+" "+
                    rs.getInt(4));
        }
       }catch (Exception e){
           System.out.println(e);
       }
   }
   public static void deleteEmployeeId(int id){
       con = DBConnection.setConnection();
       try{
           String query = "delete from employees where id ="+id;
           Statement st = con.createStatement();
           st.executeUpdate(query);
       }catch (Exception e){
           System.out.println(e);
       }
   }
   public static void updateNameOfEmployeeById(int id , String updatedName){
    con = DBConnection.setConnection();
    try {
        String query = "update employees set name=? where id=?";
        PreparedStatement pst = con.prepareStatement(query);
        pst.setString(1,updatedName);
        pst.setInt(2,id);
        pst.executeUpdate();
    }catch (Exception e){
        System.out.println(e);
    }
   }
}
