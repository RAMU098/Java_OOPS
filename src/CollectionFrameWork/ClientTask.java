package CollectionFrameWork;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.*;
class EmployeeTask {
private String name;
private int sal;
private String add;
private String mail;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getSal() {
	return sal;
}
public void setSal(int sal) {
	this.sal = sal;
}public EmployeeTask() {
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "EmployeeTask [name=" + name + ", sal=" + sal + ", add=" + add + ", mail=" + mail + "]";
}
public EmployeeTask(String name, int sal, String add, String mail) {
	super();
	this.name = name;
	this.sal = sal;
	this.add = add;
	this.mail = mail;
}
public String getAdd() {
	return add;
}
public void setAdd(String add) {
	this.add = add;
}
public String getMail() {
	return mail;
}
public void setMail(String mail) {
	this.mail = mail;
}
}

public class ClientTask {
public static void main(String[] args) {
	//database
	HashMap<Integer,EmployeeTask> hm=new HashMap<>();
	//employee id auto increment
	int empid=100;//initial id
	while(true) {
System.out.println("**********Employee Aplication***********");
System.out.println("Add Employee Details");
System.out.println("Update the employee details");
System.out.println("Get employee details");
System.out.println("Get All employee details");
System.out.println("Delete the employee details");
System.out.println("Exit");

	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	switch(n) {
	case 1:System.out.println("***Add Employee details***");
	System.out.println("Enter empname:");
	String name=sc.next();
	System.out.println("Enter empsal:");
	int sal=sc.nextInt();
	sc.nextLine();
	System.out.println("Enter empadd:");
	String add=sc.nextLine();
	System.out.println("Enter email:");
	String mail=sc.nextLine();
	EmployeeTask e=new EmployeeTask( name, sal, add, mail);
	//store database
	hm.put(++empid, e);
	System.out.println("Add sucessfully:"+empid);
	
	break;
	case 2:System.out.println("***Update Employee details***");
	System.out.println("Enter empid:");
	int empid1=sc.nextInt();
	sc.nextLine();
	System.out.println("Enter name:");
	String empname=sc.next();
	System.out.println("Enter sal:");
	int esal=sc.nextInt();
	sc.nextLine();
	System.out.println("Enter add:");
	String eadd=sc.nextLine();
	System.out.println("Enter email:");
	String Email=sc.nextLine();
	EmployeeTask update=new EmployeeTask(empname,esal,eadd,Email);
	hm.put(empid1, update);
	System.out.println("Update sucessfully:"+empid1);
	break;
	case 3:System.out.println("****Get employee details****");
	System.out.println("Enter empid:");
	int empid2=sc.nextInt();
	EmployeeTask get=hm.get(empid2);
	System.out.println(get);
	break;
	case 4:System.out.println("***All details***");
	Set<Entry<Integer,EmployeeTask>> es=hm.entrySet();
	Iterator<Entry<Integer,EmployeeTask>> itr=es.iterator();
	while(itr.hasNext()) {
		Entry<Integer,EmployeeTask> getall=itr.next();
		//System.out.println(itr.next());
		System.out.println(getall.getKey()+" "+getall.getValue());
		break;
	}
		case 5:System.out.println("**delete employee details***");
		System.out.println("Enter the empid:");
		int empid3=sc.nextInt();
		hm.remove(empid3);
		System.out.println("deleted sucessfully:"+empid3);
		break;
		case 6:System.out.println("**Exit***");
		System.out.println("Thanku");
		return;
		default:
			System.out.println("wrong details");
	
	}
	}
	}
}

