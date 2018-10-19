package schema.strategy;

public class Context {
	
	private IStrategy iStrategy;

	public Context(IStrategy iStrategy) {
		this.iStrategy = iStrategy;
	}
	
	public void operate(String name) {
		this.iStrategy.operate(name);
	}
}
