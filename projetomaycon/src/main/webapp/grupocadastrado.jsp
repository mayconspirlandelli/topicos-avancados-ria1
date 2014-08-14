<%-- 
    Document   : grupocadastrado
    Created on : 09/08/2014, 11:17:33
    Author     : alunoinf
--%>

<%@page import="br.ufg.inf.projetoaula02.bean.GrupoUsuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro de Grupo de Usuário</title>
    </head>
    <body>
        <h3>Grupo de Usuário Cadastrado com Sucesso!</h3>

        <table>
            <tr>
                <td>Id:</td>
                <td>${grupoUsuario.id}</td>
            </tr>
            <tr>
                <td>Descrição:</td>
                <td>${grupoUsuario.descricao}</td>
            </tr>
            <tr>
                <td>Ativo:</td>
                <td>${grupoUsuario.ativo}</td>
                <td> </td>
            </tr>
            <tr>
                <td>Status:</td>
                <td><input type="radio" name="status" ${grupoUsuario.ativo == 'true' ? 'checked="checked"' : ''}>Ativo
                    <input type="radio" name="status" ${grupoUsuario.ativo == 'false' ? 'checked="checked"' : ''}>Inativo</td>
            </tr>
        </table>

        <br />
        <h3>Objetos na Sessao</h3>
        <table>
            <tr>
                <td>Id:</td>
                <td>${grupoSessao.id}</td>
            </tr>
            <tr>
                <td>Descrição:</td>
                <td>${grupoSessao.descricao}</td>
            </tr>
            <tr>
                <td>Ativo:</td>
                <td>${grupoSessao.ativo}</td>
                <td> </td>
            </tr>
            <tr>
                <td>Status:</td>
                <td><input type="radio" name="status" ${grupoSessao.ativo == 'true' ? 'checked="checked"' : ''}>Ativo
                    <input type="radio" name="status" ${grupoSessao.ativo == 'false' ? 'checked="checked"' : ''}>Inativo</td>                
            </tr>
        </table>
    </body>
</html>
