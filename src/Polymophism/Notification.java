package Polymophism;
//method overloading
public class Notification {
public void notification1(String msg) {
	System.out.println("Whatsapp notification:"+msg);
}
public void notification(String msg,int num) {
	System.out.println("Instagram notification:"+msg+" "+num);
}
public void notification(String msg) {
	System.out.println("Snapchat notification:"+msg);
}
public static void main(String[] args) {
	Notification n=new Notification();
	n.notification("hii");
	n.notification("hlo", 345);
	n.notification1("byee");

}
}
