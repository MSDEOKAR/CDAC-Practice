package mail;

public class SendMailTest {

	public static void main(String[] args) {
		
		String from = "pskolte@gmail.com";
		String to = "sanjay070783@gmail.com";
		String subject = "Test";
		String message = "A test message";
		
		SendMail sendMail = new SendMail(from, to, subject, message);
		sendMail.send();
	}
}

