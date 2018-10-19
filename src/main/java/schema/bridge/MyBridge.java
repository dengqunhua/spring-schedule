package schema.bridge;
public class MyBridge extends Bridge {
	public void send() {
		getSender().send();
	}
	
	public static void main(String[]  args) {
		Bridge bridge =new MyBridge();
		Sender sender =new MailSender();
		bridge.setSender(sender);
		bridge.send();
		
	}
}
