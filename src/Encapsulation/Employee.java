package Encapsulation;

public class Employee {
private int empno;
public int getEmpno() {
	return empno;
}
public void setEmpno(int empno) {
	this.empno = empno;
}
public float getEmpsal() {
	return empsal;
}
public void setEmpsal(float empsal) {
	this.empsal = empsal;
}
private float empsal;
void display() {
	System.out.println(empno);
	System.out.println(empsal);
}
}
