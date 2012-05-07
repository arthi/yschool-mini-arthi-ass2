<%-- 
    Document   : success
    Created on : May 10, 2012, 11:03:00 PM
    Author     : Arththika
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>JSP Page</title>
    </head>
    <body>
                <center>
         <h1>You are a registered student!</h1>      
         <jsp:useBean id="ob" scope="request" class="org.ymini.arthika.modelClasses.Students" />
         <table border="2" width="400">
                 <tr>
                     <th>Attributes</th>
                     <th>Values</th>
                 </tr>
                 <tr>
                     <td>Student Name:</td>
                     <td><%=ob.getStudentname()%></td>
                 </tr>
                 <tr>
                     <td>Grade:</td>
                     <td><%=ob.getGrade()%></td>
                 </tr>
                 <tr>
                     <td>Parent Name:</td>
                     <td><%=ob.getParentname()%></td>
                 </tr>
                 <tr>
                     <td>Address:</td>
                     <td><%=ob.getAddress() %></td>
                 </tr>
                 <tr>
                     <td></td>
                     <td></td>
                 </tr>
         </table>
    </center>
    </body>
</html>
