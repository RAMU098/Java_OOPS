package Practice_Example;

public class StudentMarks {
private int marks;

public int getMarks() {
	return marks;
}

public void setMarks(int marks) {
	if(marks>100) {
		System.out.println("Invalid");
		
	}
	else {
	this.marks = marks;
}}
StudentMarks(int marks){
	this.marks=marks;
}
void display() {
	if( marks>100) {
		System.out.println("Invalid");
	}

}
}
class Ma1{
	public static void main(String[] args) {
		StudentMarks s=new StudentMarks(0);
	    s.setMarks(130);
	    
	    System.out.println(s.getMarks());
		
	s.setMarks(80);
	System.out.println(s.getMarks());
	}}
