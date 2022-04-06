<%-- 
    Document   : CompanyHomePage
    Created on : 3 avr. 2022, 16:35:21
    Author     : turf3
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Company KLF home page</title>
    </head>
    <body>
        <h1>KLF GROUP</h1>
        <h2>Login</h2>
        <form action="user" method="post">
            <input type="hidden" name="action" value="isuser" />
            Login <input type="text" name="login" /> <br/>
            Password <input type="password" name="pwd" /> <br/>
            <input type="submit" value="Connect" />
        </form>
    </body>
</html>
