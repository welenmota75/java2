package ifsp;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/adicionaContato")
public class AdicionaContatoServlet extends HttpServlet {

	 private static final long serialVersionUID = 1L;	
	 protected void service(HttpServletRequest request,
             HttpServletResponse response)
             throws IOException, ServletException {

         PrintWriter out = response.getWriter();

         String nome = request.getParameter("nome");
         String endereco = request.getParameter("endereco");
         String email = request.getParameter("email");
         String dataEmTexto = request.getParameter("dataNascimento");
         Calendar dataNascimento = null;

         try {
             Date date = new SimpleDateFormat("dd/MM/yyyy").parse(dataEmTexto);
             dataNascimento = Calendar.getInstance();
             dataNascimento.setTime(date);
         } catch (ParseException e) {
             out.println("Erro de conversão da data");
             return;
         }

         Contato contato = new Contato();
         contato.setNome(nome);
         contato.setEndereco(endereco);
         contato.setEmail(email);
         contato.setDataNascimento(dataNascimento);

         out.println("<html>");
         out.println("<body>");
         out.println("Contato " + contato.getNome() +
                 " adicionado com sucesso");       
         out.println("</body>");
         out.println("</html>");

     }
}
