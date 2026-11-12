package Java8Features;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
class EmployeeDemo{

	int id;
	String name;
	int age;
	double sal;
	public int getId() {
		return id;
	}
	public EmployeeDemo() {
		// TODO Auto-generated constructor stub
	}
	public EmployeeDemo(int id, String name, int age, int sal) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.sal = sal;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}

public class EmployeeTaskPFI {
	public static void main(String[] args) {
	//eligible age or not	
	EmployeeDemo emp=new EmployeeDemo(123,"Ramu",34,2400);
	Predicate<EmployeeDemo> eligble =a->emp.getAge()>=18;
	System.out.println(eligble.test(emp));
    //print annual salary
	Function<EmployeeDemo,Double> annSal=s->s.getSal()*12;
	System.out.println(annSal.apply(emp));
	//consumer print the empDetails
	Consumer<EmployeeDemo> empDetails=n->{
		System.out.println("Empid:"+n.getId()+"Empname:"+n.getName()+"EmpAge: "+n.getAge()+"EmpSal: "+n.getSal());
	};
	empDetails.accept(emp);
	
	//display the default department
	Supplier<String> empDept=()->"CSE";
	System.out.println(empDept.get());
}
}