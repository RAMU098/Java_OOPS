package JavaOOPs.basics.Inheritance;
//Method overloading
public class Shape2 {
private  int side;
Shape2(){
	side=10;
	System.out.println("this is Shape class constructor");
}
  void area() {//if private access it  will  run only with in the class
	int res=side*side;
	System.out.println("the square  res value:"+res);
}
public int area(int len,int breadth) {
	int res=len*breadth;
	return res;
}
void area(float radius) {//we can use protected access modifier also
	float res=(22/7)*radius*radius;
	System.out.println("this is circle value:"+res);
}
}
