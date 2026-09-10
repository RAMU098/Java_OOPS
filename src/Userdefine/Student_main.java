package Userdefine;

public class Student_main {
	public static void main(String[] args) {
Student s1=new Student();
System.out.println(s1);

	Student s2=new Student();
	System.out.println("Comparasion of 2 objects:"+(s1.equals(s2)));//comparing the hash code of the objects
	System.out.println(s1.hashCode());
	System.out.println(s2.hashCode());
	}
}
