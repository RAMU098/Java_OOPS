package Packages;
import java.io.File;
public class FileDemo1 {
public static void main(String[] args) {
	File f1=new File("abc");
	boolean value=f1.exists();
	System.out.println(value);
	boolean opt =f1.mkdir();
	System.out.println(opt);
}
}
