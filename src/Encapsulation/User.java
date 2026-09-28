package Encapsulation;

public class User {
public static void main(String[] args) {
	Bankdb b=new Bankdb();
	Bankapp a=new Bankapp();
	a.setDeposit(30000.00);
a.setWithdraw(25000.00);
	b.setBal(5000);
	//b.display();
	System.out.println(b.getBal());

}
}
