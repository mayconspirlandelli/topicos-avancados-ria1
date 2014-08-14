<%-- 
    Document   : cadastragrupousuario
    Created on : 09/08/2014, 09:33:17
    Author     : alunoinf
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro de Grupo de Usuario</title>
    </head>
    <body>
        <h3>Cadastro de Grupo de Usuario</h3>
        <form action="GrupoUsuarioServlet" method="post">
            <table>
                <tr>
                    <td>Id:</td>
                    <td><input type="text" name="idGrupo" id="idGrupo"  /></td>
                </tr>
                <tr>
                    <td>Grupo:</td>
                    <td><input type="text" name="nomeGrupo" id="nomeGrupo"  /></td>
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
    </body>
</html>
