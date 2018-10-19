package schema.state;

import java.util.Random;

public class HasCoin implements State {
    private CandyMachine mCandyMachine;
 
    public HasCoin(CandyMachine mCandyMachine) {
        this.mCandyMachine = mCandyMachine;
    }
 
    public void insertCoin() {
        System.out.println("you can't insert another coin!");
 
    }
 
    public void returnCoin() {
        System.out.println("coin return!");
        mCandyMachine.setState(mCandyMachine.mOnReadyState);
    }
 
    public void turnCrank() {
        System.out.println("crank turn...!");
        Random ranwinner=new Random();
        int winner=ranwinner.nextInt(10);
        if(winner==0)
        {
            mCandyMachine.setState(mCandyMachine.mWinnerState);
 
        }else
        {
            mCandyMachine.setState(mCandyMachine.mSoldState);
 
        }
         
    }
 
    public void dispense() {
    }
 
    public void printstate() {
        // TODO Auto-generated method stub
        System.out.println("***HasCoin***");
 
    }
 
}