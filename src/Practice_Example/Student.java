package Practice_Example;
//first program
public class Student {
int stuid,marks;
String name;
Student(){
	 stuid=1;
	 name="xyz";
      marks=100;
}
}
class CollegeStudent extends Student{
	String course,collegename;
	CollegeStudent(){
		 course="CSE";
		 collegename="SRM";
	}
		void display() {
			System.out.println(course);
			System.out.println(collegename);
			System.out.println(name);
			System.out.println(marks);
			System.out.println(stuid);
	}
}
class Main{
	public static void main(String[] args) {
		CollegeStudent s= new CollegeStudent();
		s.display();
	}
}