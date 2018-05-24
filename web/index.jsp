<%-- 
    Document   : index
    Created on : May 16, 2018, 7:42:57 PM
    Author     : kevin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <style>

        body{
            font-family: sans-serif;
        }
        
        input{
            background-color: rgb(255,255,255);
            text-align: center;
            border-radius: 5px;
            font-size: 20px;
            width: 80%;
            height: 30px;
        }
        
        div{
             background-color: rgb(157, 82, 176); 
             border-radius: 25px;
             width: 30%;
        }
        
        h1{
            background-color: rgb(150,20,120);
        }
        
        form{
            padding-bottom: 20px; 
            align-content: center;
        }
       
        
        label{
            
            font-size: 30px;
        }
        
        button{
            background-color: rgb(150, 0, 80);
            border-radius: 4px;
            text-align: center;
            font-size: 20px;
            width: 30%;
            border: none;
        }
        
        a{
            text-decoration: none;
            
        } 
    </style>
    <body>
    <center>
        <div>
            <h1>Acceder</h1>
            <form action="Servlet" method="POST">
                <label for="name">Usuario:</label><br>
                <input type="text" name="name"><br>
                <br><label for="password">Contraseña:</label><br>
                <input type="password" name="password"><br><br>
                <button>Enviar</button>     
            </form>
            <a href="Registrarse.jsp"><button>Registro</button></a><br><br>
        </div>
    </center>
</body>
</html>
