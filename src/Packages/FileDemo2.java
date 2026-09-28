package Packages;
import java.io.File;
public class FileDemo2 {
public static void main(String[] args) {
	File f1=new File("abc");
	String [] files=f1.list();
	for(int i=0;i<files.length;i++) {
		System.out.println(files[i]);
	}
}
}
