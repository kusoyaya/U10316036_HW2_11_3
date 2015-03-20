package hw113;

public class AccountTestDrive {
	public static void main(String[] args){
		Account a = new Account();
		SavingsAccount sa = new SavingsAccount();
		CheckingAccount ca = new CheckingAccount();
		System.out.println(a.toString()+"\n\n"+sa.toString()+"\n\n"+ca.toString());
	}
}
