import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class SubmitForm extends HttpServlet{
    void doPost(HttpServletRequst request,HttpServletResponse response ) throws IOException{
     PrintWriter out=response.getWriter();
     response.setContentType("text/html");
     String name=request.getParameter("name");
     String Dept=request.getParameter("Dept");
     Integer Age=request.getParameter("age");
     out.println("<h2> Employee Name " + name);
    out.println("<h2> Employee Name " + Dept);
    out.println("<h2> Employee Name " + Age);


    }
}
