package Java8Features;
interface Report{
	public void generateReport(int report);
	default void printReport() {
		System.out.println("====================");
		System.out.println("printReport Method");
		System.out.println("====================");
	}
}
class SalesReport implements Report{
	@Override
	public void generateReport(int reportno) {
		printReport();
		System.out.println("generate Sales report:"+reportno);
	}
}
class Attendence implements Report{
	@Override
	public void generateReport(int reportno) {
		printReport();
		System.out.println("generate Attendance report:"+reportno);
	}
}
public class CompanyReportInterface {
	public static void main(String[] args) {
		SalesReport sr=new SalesReport();
		sr.generateReport(23);
		Attendence ar=new Attendence();
		ar.generateReport(37);
	}

}
