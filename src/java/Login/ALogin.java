
package Login;

import dao.ExamDao;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class ALogin extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet loginServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet loginServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
     String ename=request.getParameter("name");
     String pass=request.getParameter("pass");
     
     PrintWriter out=response.getWriter();
  
        
            if(ename.equals("Admin")&&pass.equals("admin"))
            {
                out.println("valid user");
                response.sendRedirect("adminpage.jsp");
            }
            else
            {
            out.println("invalid user");
              
            }
       
    }

 
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
