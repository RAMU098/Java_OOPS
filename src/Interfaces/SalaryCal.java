package Interfaces;

public interface SalaryCal {
abstract void calsal();
}
class Developer implements SalaryCal{
	double dsal;
	int days;
	public Developer(double dsal,int days) {
		this.dsal=dsal;
		this.days=days;
	}
	public void calsal() {
		double res=dsal*days;
		System.out.println("d.sal:"+res);
	}
}
class Freelancer implements SalaryCal{
	int hours;
	double hsal;
	public Freelancer(int hours,double hsal)
	{
		this.hours=hours;
		this.hsal=hsal;
	}
	public void calsal() {
		double res=hsal*hours;
		System.out.println("f.sal:"+res);
	}
}
class Main{
	public static void main(String[] args) {
		SalaryCal s=new Developer(3000,30);
		SalaryCal s1=new Freelancer(5,2500);
		s.calsal();
		s1.calsal();
	}
}