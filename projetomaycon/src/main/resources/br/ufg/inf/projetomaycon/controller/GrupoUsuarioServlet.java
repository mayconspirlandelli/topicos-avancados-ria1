package main.resources.br.ufg.inf.projetomaycon.controller;

import br.ufg.inf.projetomaycon.bean.GrupoUsuario;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;
//import org.apache.catalina.Session;

/**
 *
 * @author alunoinf
 */
@WebServlet(name = "GrupoUsuarioServlet", urlPatterns = {"/GrupoUsuarioServlet"})
//@WebServlet(name = "GrupoUsuarioServlet")
public class GrupoUsuarioServlet extends HttpServlet {

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
            out.println("<title>Servlet GrupoUsuarioServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet GrupoUsuarioServlet at " + request.getContextPath() + "</h1>");
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
        processRequest(request, response);
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
            String id = request.getParameter("idGrupo");
            String nomeGrupo = request.getParameter("nomeGrupo");
            boolean status = "1".equals(request.getParameter("status")) ? true : false;


            GrupoUsuario grupoUsuario = new GrupoUsuario();
            grupoUsuario.setId(Integer.parseInt(id));
            grupoUsuario.setDescricao(nomeGrupo);
            grupoUsuario.setAtivo(status);
            
            
            request.getSession().setAttribute("grupoSessao", grupoUsuario);
            
            request.setAttribute("grupoUsuario", grupoUsuario);
            RequestDispatcher rd = request.getRequestDispatcher("/grupocadastrado.jsp");
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
}
