package Practice_Example;
//Smart parking System
import java.util.Scanner;
class Vehical {
int regno;
String name;
int parkdur;
Vehical(int regno,String name,int parkdur){
	this.regno=regno;
	this.name=name;
    this.parkdur=parkdur;
}
void display() {
	System.out.println(regno);
	System.out.println(name);
	System.out.println(parkdur);
}
}
class Bike extends Vehical{
	int cost=20;
	int regno;
	int parkdur;
	String name;
	Bike(int regno,String name,int parkdur){
		super(regno,name,parkdur);
		this.regno=regno;
		this.name=name;
		this.parkdur=parkdur;
	}
	void display() {
		int total=parkdur*cost;
		//System.out.println(regno);
		//System.out.println(name);
		System.out.println("Bike");
		System.out.println(total);
	}
}
class Car extends Vehical{
	int cost=50;
	int regno,parkdur;
	String name;
	Car(int regno,String name,int parkdur){
    	super(regno,name,parkdur);
		this.regno=regno;
		this.name=name;
		this.parkdur=parkdur;
	}
	void display() {
		int total=parkdur*cost;
		System.out.println("Car");
		System.out.println(total);
	}
}
class ElectricCar extends Vehical{
	int cost=30;
	int regno,parkdur;
	String name;
	ElectricCar(int regno, String name, int parkdur) {
		super(regno, name, parkdur);
		this.regno=regno;
		this.name=name;
		this.parkdur=parkdur;
		}
	void display() {
		int total=parkdur*cost;
		System.out.println("ElectricCar");
		System.out.println(total);	
	}
}
class Nani{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//System.out.println("Enter a regno:");
		//int regno=sc.nextInt();
	//	System.out.println("enter a name:");
		//sc.nextLine();
	//	String name=sc.nextLine();
	//	System.out.println("Enter a parkdur:");
	//	int parkdur=sc.nextInt();
		System.out.println("Enter a Type:");
	//	sc.nextLine();
		String Type=sc.nextLine();
		switch(Type){
		case "Bike":{
			Bike b=new Bike(120,"ramu",5);
			System.out.println(b.regno);
	    	System.out.println(b.name);
			System.out.println(b.parkdur);
			b.display();
			break;
		}
		case"Car":{
			Car c=new Car(140,"nani",6);
			System.out.println(c.regno);
			System.out.println(c.name);
			System.out.println(c.parkdur);
			c.display();
			break;
		}
		case "ElectricCar":{
				ElectricCar ec=new ElectricCar(130,"pani",7);
				System.out.println(ec.regno);
				System.out.println(ec.name);
				System.out.println(ec.parkdur);
				ec.display();
				break;
		}
		default:{
			System.out.println("enter the correct type.....");
		}
			
		}
	}
}