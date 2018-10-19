package schema.strategy;

/**
 * 策略模式
 * */
public class strategyTest {

	public static void main(String[] args) {
		String name ="dd";
		BlueStrategy blueStrategy =new BlueStrategy();
		Context context =new Context(blueStrategy);
		context.operate(name);
	}
	
}
