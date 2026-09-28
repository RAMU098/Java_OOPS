package Practice_Example;

public class Login {
	private String olduname;
	private String oldpass;
public String getoldUname() {
		return olduname;
	}
	public void setoldUname(String olduname) {
		this.olduname = olduname;
	}
	public String getoldPass() {
		return oldpass;
	}
	public void setoldPass(String oldpass) {
		this.oldpass = oldpass;
	}
//	Login(String oldpass,String olduname){
	//	this.oldpass=oldpass;
	//	this.olduname=olduname;
	///}
	void display() {
		System.out.println("oldpass:"+oldpass);
	System.out.println("olduname:"+olduname);
}
	void login(String newuname,String newpass) {
		if(oldpass==newpass&&olduname==newuname){
		System.out.println("correct");
		}
		else {
			System.out.println("incorrect");
		}
		this.olduname=newuname;
		this.oldpass=newpass;
		//System.out.println("olduname:"+olduname);
		System.out.println("newuname:"+newuname);
		//System.out.println("oldpass:"+oldpass);
		System.out.println("newpass:"+newpass);
	}
}
class Venu{
	public static void main(String[] args) {
		Login l=new Login();
		l.setoldPass("ra@123");
		l.setoldUname("Mani123");
	l.login("Mani123","ra@123");
	l.display();
	}
}
