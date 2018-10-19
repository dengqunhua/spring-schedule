package schema.state;

public class WinnerState implements State {
private CandyMachine mCandyMachine;
 
    public WinnerState(CandyMachine mCandyMachine) {
        this.mCandyMachine = mCandyMachine;
    }
 
    public void insertCoin() {
        System.out.println("please wait!we are giving you a candy!");
 
    }
 
    public void returnCoin() {
        System.out.println("you haven't inserted a coin yet!");
 
    }
 
    public void turnCrank() {
        System.out.println("we are giving you a candy,turning another get nothing,!");
 
    }
 
    public void dispense() {
 
         
        mCandyMachine.releaseCandy();
        if (mCandyMachine.getCount() == 0) {
            mCandyMachine.setState(mCandyMachine.mSoldOutState);
        } else {
            System.out.println("you are a winner!you get another candy!");
            mCandyMachine.releaseCandy();
            if (mCandyMachine.getCount() > 0) {
                mCandyMachine.setState(mCandyMachine.mOnReadyState);
            } else {
                System.out.println("Oo,out of candies");
                mCandyMachine.setState(mCandyMachine.mSoldOutState);
            }
        }
 
    }
 
    public void printstate() {
        System.out.println("***WinnerState***");
 
    }
 
}