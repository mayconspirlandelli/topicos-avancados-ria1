package main.resources.br.ufg.inf.projetomaycon.controller;

import br.ufg.inf.projetomaycon.bean.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author alunoinf
 */
@WebServlet(name = "UsuarioServlet", urlPatterns = {"/UsuarioServlet"})
public class UsuarioServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet UsuarioServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet UsuarioServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            Usuario usuario = new Usuario();
            if (valideDados(request)) {
                //cadastra usuario

                usuario.setId(Integer.parseInt(request.getParameter("idUsuario")));
                usuario.setLogin(request.getParameter("login"));
                usuario.setSenha(request.getParameter("senha"));
                usuario.setAtivo("1".equals(request.getParameter("status")) ? true : false);

                //  private Date ultimoLogin;
                //  private GrupoUsuario grupo;

                //request.setAttribute("usuario", usuario);
                
                request.setAttribute("mensagem", "Usuario cadastrado com sucesso!");


            } else {
                //exibi mensagem de error.   
                out.println("Dados Inválidos");                
            }



            RequestDispatcher rd = request.getRequestDispatcher("/cadastrausuario.jsp");
            rd.forward(request, response);


        } catch (Exception e) {
            out.println("Error");
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private boolean valideDados(HttpServletRequest request) {

        if (request.getParameter("idUsuario").isEmpty()) {
            exibeMensagem("Id inválido", request);
            return false;
        }
        if (request.getParameter("login").isEmpty()) {
            exibeMensagem("Login inválido", request);
            return false;
        }
        if (request.getParameter("senha").isEmpty()) {
            exibeMensagem("Senha inválido", request);
            return false;
        }
        if (request.getParameter("status").isEmpty()) {
            exibeMensagem("Staus inválido", request);
            return false;
        }
        return true;
    }
    
    private void exibeMensagem(String campo, HttpServletRequest request) {
         request.setAttribute("mensagem", "O campo" + campo + "");
    }
}
