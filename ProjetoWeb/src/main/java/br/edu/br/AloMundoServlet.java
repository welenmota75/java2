package br.edu.br;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/alomundo")
public class AloMundoServlet extends HttpServlet {
public void doGet(HttpServletRequest request, HttpServletResponse response)
throws IOException {
response.setContentType("text/html;charset=UTF-8");
PrintWriter out = response.getWriter();
out.println("<HTML><BODY>");
out.println("<P>Alo Mundo!</P>");
out.println("</BODY></HTML>");
out.close();
}
}
