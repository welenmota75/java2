package ifsp;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "HelloWorldServlet", urlPatterns = { "/hello", "/world"})
public class HelloWorldServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void service (HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {

        PrintWriter out = response.getWriter();

        
        out.println("<html>");
        out.println("<body>");
        out.println("Hello World");
        out.println("</body>");
        out.println("</html>");
        
        out.close();
    }
}
