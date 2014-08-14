<%-- 
    Document   : cadastrousuario
    Created on : 09/08/2014, 14:03:19
    Author     : alunoinf
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro Usuario</title>
    </head>
    <body>
        <h3>Cadastro de Usuario</h3>
        <form action="UsuarioServlet" method="post">
            <table>
                <tr>
                    <td>Id:</td>
                    <td><input type="text" name="idUsuario" id="idUsuario"  /></td>
                </tr>
                <tr>
                    <td>Login:</td>
                    <td><input type="text" name="login" id="login"  /></td>
                </tr>
                <tr>
                    <td>Senha:</td>
                    <td><input type="text" name="senha" id="senha"  /></td>
                </tr>
                <tr>
                    <td>Status:</td>
                    <td><input type="radio" name="status" value="1">Ativo
                        <input type="radio" name="status" value="0">Inativo</td>
                </tr>
                <tr>
                    <td><input type="submit" name="btnCadastrar" value="Cadastrar" /></td>
                </tr>
            </table>
        </form>
        <div id="dvMensagem">
            <label id="lblMensagem">${mensagem}</label>            
        </div>

    </body>
</html>
