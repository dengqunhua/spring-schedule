package schema.state;

public class SoldOutState implements State{
	 private CandyMachine mCandyMachine;
	    public SoldOutState(CandyMachine mCandyMachine)
	    {
	        this.mCandyMachine=mCandyMachine;
	    }
	 
	    public void insertCoin() {
	        // TODO Auto-generated method stub
	        System.out.println("you can't insert coin,the machine sold out!");
	         
	    }
	 
	    public void returnCoin() {
	        // TODO Auto-generated method stub
	        System.out
	        .println("you can't return,you haven't inserted a coin yet!");
	 
	    }
	 
	    public void turnCrank() {
	        // TODO Auto-generated method stub
	        System.out.println("you turned,but there are no candies!");
	         
	    }
	 
	    public void dispense() {
	        // TODO Auto-generated method stub
	 
	    }
	 
	    public void printstate() {
	        // TODO Auto-generated method stub
	        System.out.println("***SoldOutState***");
	     
	    }
	 
	}