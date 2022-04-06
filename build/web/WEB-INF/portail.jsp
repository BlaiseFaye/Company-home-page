
<%@page import="model.javabean.User"%>
<%
   User user = (User) session.getAttribute("user");
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>KLF Group</title>
        <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    </head>
    <body>
       

        
         
<nav class="navbar navbar-default">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">KLF GROUP</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="#">Home</a></li>
      <li><a href="#">Recognition Software Development</a></li>
      <li><a href="#">Reward Marketplace Sourcing and Management</a></li>
      <li><a href="#">Fulfillment Logistics (3PL)</a></li>
    </ul>
  </div>
</nav>
  Welcome <%=user.getNom()%>
        </br>
        <button type="button" class="btn">
        <a href="user?action=logout" >  Log Out</a>
        </button>
          </br>
<div class="container">
  <h3>About us</h3>
  <p style="width: 500px; font-size: 15px">
The KLF Group specializes in building, funding and scaling companies in the Reward and Recognition industry. Its portfolio of assets includes Loyalty Source, Warehouse&Go and Engentive. Industry leaders in rewards program fulfillment and third party logistics, KLF has built a rich collection of enterprise platforms using a unified and scalable approach to infrastructure.</p>
</div>
        <div class="container">
  <h2>CORE SERVICES</h2>
 <p style="width: 500px; font-size: 15px">

 WE PROVIDE END-TO-END SOLUTIONS FROM EMPLOYEE ENGAGEMENT SOFTWARE DEVELOPMENT TO LAST-MILE REWARD LOGISTICS.
    </p>
</div>
       
    </body>
</html>
