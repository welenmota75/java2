package testandoEmail;

import java.net.Authenticator;
import java.net.PasswordAuthentication;
import java.util.Properties;
import javax.mail.internet.InternetAddress;

public class EmailSender {

	   public static void sendEmail(String toEmail, String subject, String body) throws MessagingException {

	      String fromEmail = "seuemail@gmail.com"; //seu endereço de email
	      String password = "suasenha"; //sua senha

	      // Defina as propriedades do servidor de e-mail
	      Properties props = new Properties();
	      props.put("mail.smtp.auth", "true");
	      props.put("mail.smtp.starttls.enable", "true");
	      props.put("mail.smtp.host", "smtp.gmail.com"); //ou outro servidor de email
	      props.put("mail.smtp.port", "587"); //ou outro port

	      // Crie a sessão de e-mail com autenticação
	      Session session = Session.getInstance(props, new Authenticator() {
	         protected PasswordAuthentication getPasswordAuthentication() {
	            return new PasswordAuthentication(fromEmail, password);
	         }
	      });

	      // Crie a mensagem de e-mail
	      Message message = new MimeMessage(session);
	      message.setFrom(new InternetAddress(fromEmail));
	      message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmail));
	      message.setSubject(subject);
	      message.setText(body);

	      // Envie a mensagem de e-mail
	      Transport.send(message);
	   }
	}
