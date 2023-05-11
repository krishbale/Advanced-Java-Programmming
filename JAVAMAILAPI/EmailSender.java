import java.net.PasswordAuthentication;
import java.util.Properties;

import javax.mail.*;
import javax.mail.internet.*;

public class EmailSender {

   public static void main(String[] args) {

      // Set the properties of the mail session
      Properties props = new Properties();
      props.put("mail.smtp.host", "smtp.gmail.com");
      props.put("mail.smtp.port", "587");
      props.put("mail.smtp.auth", "true");
      props.put("mail.smtp.starttls.enable", "true");

      // Create a mail session with the properties
      Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
         protected PasswordAuthentication getPasswordAuthentication() {
            return new PasswordAuthentication("your_email@gmail.com", "your_password");
         }
      });

      try {
         // Create a message object
         Message message = new MimeMessage(session);
         message.setFrom(new InternetAddress("your_email@gmail.com"));
         message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("recipient_email@example.com"));
         message.setSubject("Testing Java Mail API");
         message.setText("Dear Recipient," + "\n\n This is a test email sent using Java Mail API.");

         // Send the email message
         Transport.send(message);

         System.out.println("Email message sent successfully.");

      } catch (MessagingException e) {
         throw new RuntimeException(e);
      }
   }
}

