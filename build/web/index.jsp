<%-- 
    Document   : index
    Created on : Mar 11, 2017, 11:03:57 PM
    Author     : yasta
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Autorizations Form</title>
        <link href="css/style.css" type="text/css" rel="stylesheet"/>
    </head>
    <body>    

        <div class="login-page">
            <div class="form">
                <form class="register-form">
                    <input type="text" placeholder="name"/>
                    <input type="password" placeholder="password"/>
                    <input type="text" placeholder="email address"/>
                    <button>create</button>
                    <p class="message">Already registered? <a href="#">Sign In</a></p>
                </form>
                <form  action="Controller" method="POST" class="login-form" >
                    <input type="text" name="username" placeholder="username"/>
                    <input type="password" name="password" placeholder="password"/>                      
                    <button>Log in</button>
                    <p class="message">Not registered? <a href="#">Create an account</a></p>
                </form>
            </div>
        </div>
        <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>

    <script src="js/index.js"></script>
    </body>
</html>
