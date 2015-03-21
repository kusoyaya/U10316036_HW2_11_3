package hw113;

public class SavingsAccount extends Account{

	@Override
	public void withdraw(double money){
		if(money <= super.getBalance()){
			super.withdraw(money);// if money isn't over balance invoke the orginal method 
		}else{
			System.out.println("The account cannot be overdrawn!");
		}
	}
	
	@Override
	public String toString(){
		return ("This is a checking account\n"+super.toString());
	}
}
