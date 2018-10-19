package schema.observer;

public class Test extends ObserverTest {

	public void print() {
		System.out.println("son");
	}
	public static void main(String[] args) {
		Subject sub = new MyObject();  
        sub.add(new Observer1());  
        sub.add(new Observer2());  
          
        sub.operation();  
	}

}
