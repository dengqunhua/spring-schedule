package schema.strategy;
public class GreenStrategy implements IStrategy {

	public void operate(String name) {
		System.out.println("green:"+name);
	}

}
