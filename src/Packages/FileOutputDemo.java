package Packages;
import java.io.FileInputStream;
import java.io.FileOutputStream;
public class FileOutputDemo {

	public static void main(String[] args) {
		try
		{
			FileInputStream fis=new FileInputStream("abc.txt");//fis=(abc.txt);
		    FileOutputStream fos=new FileOutputStream("xyz.txt",true);//if true it will be append else write only once
			int n ;
			while((n=fis.read())!=-1){
			System.out.print((char)n);	
			fos.write(n);
			}
			fis.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	}

