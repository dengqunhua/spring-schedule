package schema.factory;

public class SenderFactory {
	public static Sender produce(String type) {
			if("mail".equals(type)){
				return new MailSender();
			}else if("sms".equals(type)) {
				return new SmsSender();
			}
			return null;
	}
	
	public static void main(String[] args) {
		Sender sender =SenderFactory.produce("sms");
		sender.send();
	}
}
