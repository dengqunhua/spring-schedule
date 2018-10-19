package schema.state;

public class SoldState  implements State {
	 private CandyMachine mCandyMachine;
	    public SoldState(CandyMachine mCandyMachine)
	    {
	        this.mCandyMachine=mCandyMachine;
	    }
	 
	    public void insertCoin() {
	        System.out.println("you can't insert coin,the machine sold out!");
	         
	    }
	 
	    public void returnCoin() {
	        System.out.println("you can't return,you haven't inserted a coin yet!");
	 
	    }
	 
	    public void turnCrank() {
	        System.out.println("you turned,but there are no candies!");
	         
	    }
	 
	    public void dispense() {
	 
	    }
	 
	    public void printstate() {
	        System.out.println("***SoldOutState***");
	    }
	 
	}