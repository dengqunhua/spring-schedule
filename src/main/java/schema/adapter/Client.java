package schema.adapter;

public class Client {

	public static void main(String[] args) {
		Target target =new ConcreteTarget();
		target.request();
		Adapter adapter =new Adapter();
		adapter.request();
	}

}
