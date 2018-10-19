package schema.state;

public class OnReadyState implements State {
	private CandyMachine mCandyMachine;
    public OnReadyState(CandyMachine mCandyMachine)
    {
        this.mCandyMachine=mCandyMachine;
    }
 
    public void insertCoin() {
        System.out
        .println("you have inserted a coin,next,please turn crank!");
        mCandyMachine.setState(mCandyMachine.mHasCoin);
    }
 
    public void returnCoin() {
        System.out.println("you haven't inserted a coin yet!");
         
    }
 
    public void turnCrank() {
        System.out.println("you turned,but you haven't inserted a coin!");
         
    }
 
    public void dispense() {
 
    }
 
    public void printstate() {
        System.out.println("***OnReadyState***");
         
    }
 
}