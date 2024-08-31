/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pranjal_fees_management;

import java.sql.*;

/**
 *
 * @author kanak
 */
public class mylib {
    
    public Connection connect()
        {
            Connection cn=null;
            try
            {

                Class.forName("com.mysql.jdbc.Driver");
                String path="jdbc:mysql://localhost:3306/feemanagementsystem";
                String dbuser="root";
                String dbpass="";
                cn=DriverManager.getConnection(path,dbuser,dbpass);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }

            return cn;
        }
     public String getCourseName(int cid)
        {
            String s=null;
            try
            {
               Connection cn=new mylib().connect();
               String sql="select * from coursedata where course_id=?";
               PreparedStatement p1=cn.prepareStatement(sql);
               p1.setInt(1, cid);
               ResultSet r1=p1.executeQuery();
               if(r1.next())
               {
                   s=r1.getString("course_name");
               }            
            }
            catch(Exception e)
            {
                System.out.println(""+e);
            }
        return s;
    }

    
    
    public int course_paid(int stu_id,int course_id)
    {
        int t=0; 
        try
        {
            Connection cn=this.connect();
            String sql="select * from installmentdata where stu_id=? and course_id=?";
            PreparedStatement p1=cn.prepareStatement(sql);
            p1.setInt(1, stu_id);
            p1.setInt(2, course_id);
            ResultSet r1=p1.executeQuery();
            while(r1.next())
            {
                t=t+r1.getInt("amount");
            }
          }  
         catch(Exception e)
         {
             System.out.println(e);
         }
         return t;
    }
    
}

