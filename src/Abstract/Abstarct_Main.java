package Abstract;

public class Abstarct_Main {
public static void main(String[] args) {
	Rectangle r1=new Rectangle();
	r1.display();//calling super class method
	r1.area();//calling rectangle sub class method
	r1.perimeter();//by using sub class object reference we can call both sub and super class methods
	
	
	
	//super class object reference
	Shape s1;//super class reference variable s1=null
	s1=r1;//reference the sub class in super class reference variable
	s1.display();//it will not allocate the value
	s1.area();
	//s1.perimeter();//error because the reference is on the super class we cannot call sub class method by using super class object reference

}
}



//note:super class object cannot be assigned to sub class reference variable,it does not allow