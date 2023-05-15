package atividadeBernas;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Cadastro")
public class Cadastro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Cadastro() {
        super();
        // TODO Auto-generated constructor stub
    }



	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nome = request.getParameter("nome");
		String endereço = request.getParameter("endereço"); 
		String bairro = request.getParameter("bairro"); 
		String cidade = request.getParameter("cidade"); 
		String cep = request.getParameter("cep");
		String telefone = request.getParameter("telefone");
		
		if(nome.isBlank()|| endereço.isBlank()|| bairro.isBlank()|| cidade.isBlank()|| cep.isBlank()|| telefone.isBlank()) {
			response.sendRedirect(request.getContextPath()+ "/index.jsp");
		}
	else {
		System.out.println("Cadasto realizado com sucesso");
		}
	}

}
