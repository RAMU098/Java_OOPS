package Java8Features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee{
	int id;
	 String name;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	//============no need this in lambda because visibility is less============ 
	//public int getId() {
//		return id;
///	}
//	public void setId(int id) {
	//	this.id = id;
	//}
//	public String getName() {
	//	return name;
	//}
//	public void setName(String name) {
	//	this.name = name;}
}
public class EmployeeLambdaTask {
	public static void main(String[] args) {
		ArrayList<Employee> a=new ArrayList<>();
		a.add(new Employee(101,"Ramu"));
		a.add(new Employee(105,"Raju"));
		a.add(new Employee(102,"Nani"));
		System.out.println(a);
		//========withlambda==============
		Comparator<Employee> c=(e1,e2)->(e1.id>e2.id)?1:(e1.id<e2.id)?-1:0;
		Collections.sort(a,c);
		System.out.println(a);
	}

}
