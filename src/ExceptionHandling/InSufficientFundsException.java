package ExceptionHandling;

public  class InSufficientFundsException extends Exception{
   InSufficientFundsException(String str){
     super(str);
}
}
 class BankAccount{
	public static void main(String[] args) {
		int deposit=10000,withdraw=30000;
		if(deposit>=withdraw) {
		int balance=deposit-withdraw;
			System.out.println("the balance amount is"+balance);
		}
		else {
			try {
			InSufficientFundsException funds=new InSufficientFundsException("Funds are not available");
					throw funds;
			}
			catch(Exception e) {
				System.out.println(e);
		  }
		}
		
	}
}