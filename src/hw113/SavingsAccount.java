package hw113;

public class SavingsAccount extends Account{
	private double overDrift;// announce new variable about over drift limit
	
	public void setOverDrift(double overDrift){
		this.overDrift = overDrift;
	} //overdrift mutator
	
	public double getOverDrift(){
		return overDrift;
	} //overdrift accessor
	
	@Override
	public void withdraw(double money){
		if(money <= (super.getBalance() + this.overDrift)){
			super.withdraw(money); // if money isn't over balance and overdrift invoke the orginal method 
		}else{
			System.out.println("You have exceed overdrift limit!");
		}
	} //override the withdraw method
	
	@Override
	public String toString(){
		return ("This is a savings account\n"+super.toString());
	}
}
