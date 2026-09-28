package ExceptionHandling;



public  class Throws extends Exception{
   Throws(String str){
     super(str);
}
}
 class Bank{
	public static void main(String[] args) throws InSufficientFundsException {
		int deposit=10000,withdraw=30000;
		if(deposit>=withdraw) {
		int balance=deposit-withdraw;
			System.out.println("the balance amount is"+balance);
		}
		else {
			InSufficientFundsException funds=new InSufficientFundsException("Funds are not available");
					throw funds;
		
		  }
		}
		


}
