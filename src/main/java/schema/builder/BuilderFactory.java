package schema.builder;

import java.util.ArrayList;
import java.util.List;


public class BuilderFactory {
	List<Sender> senders =new ArrayList<Sender>();
	
	public  void produceMail(int count) {
		for (int i = 0; i < count; i++) {
			senders.add(new MailSender());
		}
	}
	
	public  void produceSms(int count) {
		for (int i = 0; i < count; i++) {
			senders.add(new SmsSender());
		}
	}
	
	public static void main(String[] args) {
		BuilderFactory builderFactory =new BuilderFactory();
		builderFactory.produceMail(2);
	}
}
