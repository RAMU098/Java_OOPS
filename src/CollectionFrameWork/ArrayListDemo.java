package CollectionFrameWork;
import java.util.ArrayList;
import java.util.Iterator;
class Employee{
	private int eno;
	public Employee() {
		
	}
	public Employee(int eno, String ename, int esalary) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.esalary = esalary;
	}
	@Override
	 public String toString() {
			return "Employee [eno=" + eno + ", ename=" + ename + ", esalary=" + esalary + "]";
		}
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getEsalary() {
		return esalary;
	}
	public void setEsalary(int esalary) {
		this.esalary = esalary;
	}
	private String ename;
	private int esalary;
}
class ArrayListDemo extends Employee{
public static void main(String[] args) {
	ArrayList a=new ArrayList();
	a.add(new Employee(1000,"Ramu",12300));
	a.add(new Employee(120,"Raju",122345));
	a.add(new Employee(130,"Tharun",123672));
	a.sort(new NameComparator());             //for sorting
	System.out.println(a);
    Employee obj=(Employee)a.get(2);
	System.out.println(a);
	System.out.println("Old object values"+obj);
	obj.setEno(1980);                                       //to set or change the values and numbers
	obj.setEname("Ran");
	System.out.println("new object values"+obj);
    a.set(2,"Zero");
    System.out.println(a);
    a.add(3,"ram");
    System.out.println(a);
    //Object a1=a.remove(1);
   // System.out.println(a);
    Object obj1=a.remove(3);
    System.out.println(obj1);
    System.out.println("the element from array list");

    Iterator it=a.iterator();              //iterator helps to print the list  line by line
    while(it.hasNext()) {
    	System.out.println(it.next());
    }

}
}