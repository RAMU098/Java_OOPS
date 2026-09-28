package Packages;
import java.io.File;
import java.io.IOException;
public class FileDemo {
public static void main(String[] args) throws IOException {
	File f1=new File("abc.txt");
	boolean value=f1.exists();
	System.out.println(value);
	//try {
	boolean b1= f1.createNewFile();
	//catch(Exception e) {
		System.out.println(b1);
	System.out.println("The File path is "+f1.getPath());
	System.out.println("The Parent File is "+f1.getParent());
	System.out.println("Check Readable or Writable file is "+f1.canRead());
	System.out.println("Writeable file or not is "+f1.canWrite());
	System.out.println(File.pathSeparator);
	System.out.println(File.separator);

}

}
