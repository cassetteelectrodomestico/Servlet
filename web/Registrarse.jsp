<%-- 
    Document   : Registrarse
    Created on : 20/05/2018, 05:50:12 PM
    Author     : Cristofer
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
            <h1>Registrese</h1>
            <form method = "POST" action="Registro">
                <input type="text" name="nombre" placeholder="Nombre"/><br><br>
                <input type="text" name="apellido" placeholder="Apellido"/><br><br>
                <input type="text" name="username" placeholder="Usuario"/><br><br>
                <input type="password" name="password" placeholder="Contraseña"/><br><br>
                <button>Registrarse</button>
            </form>
            <a href="index.jsp"><button>Volver</button></a><br><br>
        </div>
    </center>
</body>
</html>
