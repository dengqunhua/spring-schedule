package schema.bridge;

public abstract class Bridge {
	private Sender sender;

	public Sender getSender() {
		return sender;
	}

	public void setSender(Sender sender) {
		this.sender = sender;
	}
	
	public void send(){
		sender.send();
	}
	
	

}
