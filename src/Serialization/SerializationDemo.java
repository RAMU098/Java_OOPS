package Serialization;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {
public static void main(String[] args) throws Exception{
	FileOutputStream fos=new FileOutputStream("sample.txt");
	ObjectOutputStream oos=new ObjectOutputStream(fos);
	Employee e1= Employee.getValues();
	oos.writeObject(e1);
	System.out.println("Object written into file");
}
}
