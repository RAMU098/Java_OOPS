package Java8Features;
interface EmployeeService{
	public void display(int empid,String name);
	public static boolean isValidEmployee(int empid) {
		return empid>=1000 && empid<=9999;
	}
}
class HrService implements EmployeeService{
	@Override
	public void display(int empid,String name) {
		System.out.println("Empid:"+empid+"  Empname:"+name);
	}
	
}
public class EmployeeStaticInterface {
public static void main(String[] args) {
	int empid=2222;
	if(EmployeeService.isValidEmployee(empid)) {
		HrService hs=new HrService();
		hs.display(empid,"Ramu");
	}
	else {
		System.out.println("invalid");
	}
}
}
