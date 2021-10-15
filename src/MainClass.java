
public class MainClass {

	  public static void main(String args[]){  

		EmailFactory factory = new EmailFactory();
		
        Email email = factory.createNotification("DE");
        email.createEmail();
        email.sentEmail();
        
        Email email1 = factory.createNotification("CE");
        email1.createEmail();
        email1.sentEmail();
	}

}
