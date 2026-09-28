package Packages;
import java.io.FileInputStream;
public class FileInputStreamDemo {
public static void main(String[] args) {
	try(FileInputStream fis =new FileInputStream("abc.txt")) //it is try with resources
	{
	//	FileInputStream fis=new FileInputStream("abc.txt");//fis=(abc.txt);
		int n ;
		while((n=fis.read())!=-1){
		System.out.print((char)n);	
		}
		fis.close();//if we use try with resources we need not to use close operation
	}
	catch(Exception e) {
		System.out.println(e);
	}
}
}
