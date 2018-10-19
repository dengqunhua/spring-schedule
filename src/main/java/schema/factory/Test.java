package schema.factory;

import java.math.BigDecimal;
/**
 * 工厂模式
 * */
public class Test {
	
	public static void main(String[] args) {
		BigDecimal bigDecimal =new BigDecimal(3452);
		BigDecimal bigDecimal2 =new BigDecimal(100);
		BigDecimal b3 = bigDecimal.divide(bigDecimal2,2,BigDecimal.ROUND_HALF_UP);
		BigDecimal b4 = bigDecimal.divide(bigDecimal2,2,BigDecimal.ROUND_DOWN);
		System.out.println(b3.doubleValue());
		System.out.println(b4.doubleValue());
	}
	
}
