<%@page import="pranjal_fees_management.mylib"%>
<%@page import="java.sql.*"%>
<%
    String stu_id=request.getParameter("H1");
    if(stu_id==null)
    {
        response.sendRedirect("showstudent.jsp");
    }
    else
    {
        Class.forName("com.mysql.jdbc.Driver");

        //Create conection
        String dbpath="jdbc:mysql://localhost:3306/feemanagementsystem";
        String dbuser="root";
        String dbpass="";
        //load driver for mysql-connectivity with java

        Connection cn=DriverManager.getConnection(dbpath, dbuser, dbpass);

        //Create sql command
        String sql="select * from studentdata where stu_id=?";


        //create statement
        PreparedStatement p1=cn.prepareStatement(sql);
        int s_id=Integer.parseInt(stu_id);
        p1.setInt(1, s_id);
        
        //Fetch data
        ResultSet r1=p1.executeQuery();

        while(r1.next())
        {
            String a,b,c,d,e,g;
            a=r1.getString("name");
            b=r1.getString("address");
            c=r1.getString("contact");
            d=r1.getString("branch");
            e=r1.getString("email");
            g=r1.getString("stu_id");


            %>
            <%
        String s1="select * from stu_photo where stu_id=?";
        PreparedStatement p2=cn.prepareCall(s1);
        p2.setInt(1,s_id);
        ResultSet r2=p2.executeQuery();
        if(r2.next()) //photo found
        {
            String photo=r2.getString("photo");
            %>
       <img src="photos/<%= photo %>" width="105" height="100" />
           <%
        }
        else
        { 
        %>
        
        <form method="post"  enctype="multipart/form-data" action="uploadphoto.jsp?stu_id=<%= g %>" >
            <p>Photo 
              <label for="F1"></label>
          <input type="file" name="F1" id="F1" />
            </p>
            <p>
              <input type="submit" name="B1" id="B1" value="Upload Photo" />
</p>
        </form>
   <%
          }
    %>
    

   

            <h3><%= g %>.<%= a%></h3>

            <p>
               <br/>
               address: <%= b %><br/>
                contact :<%= c %><br/>
                branch: <%= d %><br/>
                email: <%= e %><br/>
            </p>
            <form method="post" action="editstudent.jsp">
                <input type="hidden" name="H1" value="<%= g %>" />
                <input type="submit" name="B1" class="btn1" value="Edit" />
            </form>
                <form method="post" action="deletestudent.jsp">
                <input type="hidden" name="H1" value="<%= g %>" />
                <input type="submit" name="B1" class="btn1" value="Delete" />
            </form>
                
                <form method="post" action="addcourse.jsp">
                    <h1>courses</h1>
                    
            <input type="hidden" name="t1" value="<%= g %>" />
            <input type="submit" name="k1" class="btn1" value="add" />
        </form>
            <table border="2px solid #000">
                <tr>
                    <th>stu_id</th>
                    <th>course_id</th>
                    <th>course_name</th>
                    <th>course_fees</th>
                    <th>duration</th>
                    <th>commencement_date</th>
                    <th>paid</th>
                    <th>due</th>
                    <th>pay</th>
                    <th>changes</th>
                </tr>
                <%
                    
        Class.forName("com.mysql.jdbc.Driver");

        //Create conection
        String path="jdbc:mysql://localhost:3306/feemanagementsystem";
        String user="root";
        String pass="";
        //load driver for mysql-connectivity with java

        Connection pn=DriverManager.getConnection(path, user, pass);

        //Create sql command
                    String s3="select * from coursedata where stu_id=?";
                    PreparedStatement p3=cn.prepareStatement(s3);
                    int total_fee=0;
                    p3.setInt(1, s_id);
                    ResultSet r3=p3.executeQuery();
                    while(r3.next())
                     {
                
                        String j,k,l,m;
                        int r=r3.getInt("stu_id");
                        int s=r3.getInt("course_id");
                        j=r3.getString("course_name");
                        k=r3.getString("course_fees");
                        total_fee=total_fee+Integer.parseInt(k);
                        l=r3.getString("duration");
                        m=r3.getString("commencement_date");
                        int course_paid=new mylib().course_paid(r,s);
                        int course_due=Integer.parseInt(k)-course_paid;
                       
               
        %>       
        <tr>
            <td><%= r %></td>
            <td><%= s %></td>
            <td><%= j %></td>
            <td><%= k %></td>
            <td><%= l %></td>
            <td><%= m %></td>
            <td><%= course_paid %></td>
            <td><%= course_due %></td>
            
            <td>
                <%
                    if(course_due==0)
                    {
                        %>
                        <p> Completed </p>
                        <%
                    }
                    else
                    {
                    %>
                <form method="post" action="installment.jsp">
                        <input type="hidden" name="S1"  value="<%= g %>"/>
                        <input type="hidden" name="S2"  value="<%= s %>"/>
                        <input type="hidden" name="S3"  value="<%=k %>"/>
                        <input type="submit" name="S4" value="pay"/> 
                    </form>
            
                    <%
                    }
                    %>
                    </td>
                    <td>
                        <form method="post" action="editcourse.jsp">
                <input type="hidden" name="t1" value="<%= g %>"/>
                <input type="hidden" name="t2" value="<%= s %>"/>
                <input type="hidden" name="t3" value="<%= j %>"/>
                <input type="hidden" name="t4" value="<%= k %>"/>

                <input type="submit" name="B2" value="edit" />
               
                </form>
                    
                </td>
                
        </tr>
        
        <%
                     }
        %>

            </table>
        <h3>Total:<%= total_fee %></h3>
      
            <br/>
            
            
            <h1>Installment</h1>
                <table border="2px solid #000000">
                    <tr>
                        <th>trans_ID</th>
                        <th>stu_id</th>
                        <th>Course_name</th>
                        <th>Amount</th>
                        <th>trans_date</th>
                        <th>Remarks</th>
                    </tr>
                    <%
            String s4="select * from installmentdata where stu_id=?";
            PreparedStatement p4=cn.prepareCall(s4);
            p4.setInt(1, s_id);
            ResultSet r4=p4.executeQuery();
            int paid=0;
            while(r4.next())
            {
                String i,j,k,l; 
                int n=r4.getInt("trans_id");
                int h=r4.getInt("stu_id");
                l=r4.getString("course_id");
                String course=new mylib().getCourseName(Integer.parseInt(l));
                i=r4.getString("amount");
                paid=paid+Integer.parseInt(i);
                j=r4.getString("trans_date");
                k=r4.getString("remark");
                
            
%>
            <tr>
                <td><%= n %></td>
                <td><%= h %></td>
                <td><%= course %></td>
                <td><%= i %></td>
                <td><%= j %></td>
                <td><%= k %></td>
                
            </tr>   
<%          
            }
            int due=total_fee-paid;
           %>
           
         <h3>total paid:<%= paid %>
         <h3>due:<%= due %>
            <%
        }
    }
    %>
    