
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author yasta
 */
@WebServlet("/Controller")
public class Controller extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = resp.getWriter()) {
            String userName = req.getParameter("username");
            String pass = req.getParameter("password");
            try {
                if (userName != null) {
                    if (userName.equals("Stas") && pass.equals("12345")) {
                        resp.sendRedirect("welcome.jsp");
                    }

                } else {
                    out.print("Login Failed");
                }
            } catch (Exception e) {
                out.println("Error: " + e.getMessage());
            }
        }
        
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

}
