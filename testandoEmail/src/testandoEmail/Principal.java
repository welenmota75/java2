package testandoEmail;

public class Principal {

	public static void main(String[] args) {
	      String toEmail = "destinatario@exemplo.com";
	      String subject = "Assunto do E-mail";
	      String body = "Corpo do E-mail";
	      entities.sendEmail(toEmail, subject, body);
	}

}
