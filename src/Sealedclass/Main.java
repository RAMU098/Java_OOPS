package Sealedclass;
//using sealed  
 import java.util.Scanner;                                                                    //sealed class can give permition to access child class using final in child class
sealed class Vehical permits Car,Bus,Bike {
void start() {
	System.out.println("vehical started..");
}
}
final class Car extends Vehical{                                        //using final in class for permited child class
	
}
sealed class Bus extends Vehical permits ElectricBus{                                        //using sealed class we can satisfied the three 1.final,2.sealed,3.non-sealed
	                                                         //for giving final it will be final we cannot extends
	                                                        //for giving sealed for child we can permit another class we can extends only permits one using final
	
}                                                                       //for non-sealed it is same as inheritance we can extends or access any number of class
non-sealed class Bike extends Vehical{

	}
	

final class ElectricBus extends Bus{
	
}
class ElectricBike extends Bike{
	
}
public class Main{
public static void main(String[]args) {
	Car c1=new Car();
	Bus b2=new Bus();
	Bike b=new Bike();
	ElectricBus eb=new ElectricBus();
	ElectricBike Eb1=new ElectricBike();
	b.start();
	c1.start();
	b2.start();
	Eb1.start();
	eb.start();
}
}

