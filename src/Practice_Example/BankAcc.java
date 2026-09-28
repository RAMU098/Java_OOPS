package Practice_Example;

public class BankAcc {
private int accno;
private String accholname;
private double bal;
public int getaccno() {
	return accno;
}
public void setaccno(int accno) {
	this.accno=accno;
}
public String accholname() {
	return accholname;
}
public void setaccholname(String accholname) {
	this.accholname=accholname;
}
public double getbal() {
	return bal;
}
public void setbal(double bal) {
	this.bal=bal;
}
int dep,withdraw;
BankAcc(int dep,int withdraw){
	this.dep=dep;
	this.withdraw=withdraw;
	
}
void display() {
	bal=dep-withdraw;
	System.out.println(bal);
}
}
class Main1{
	public static void main(String[] args) {
		BankAcc ba=new BankAcc(20000,3000);
		ba.display();
	}
}
