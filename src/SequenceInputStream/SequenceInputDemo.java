package SequenceInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Enumeration;                             //Enumeration is used to read more than 2 files
import java.util.Vector;
public class SequenceInputDemo {
public static void main(String[] args) throws IOException {

	FileInputStream fis1=new FileInputStream("abc.txt");
	FileInputStream fis2=new FileInputStream("sample.txt");
	File f1=new File("abc1.txt");
	f1.createNewFile();
	FileInputStream fis3=new FileInputStream("abc1.txt");
	FileOutputStream fos=new FileOutputStream("xyz.txt");
     Vector al=new Vector();
	al.add(fis1);
	al.add(fis2);
	al.add(fis3);
	Enumeration e1=al.elements();
	SequenceInputStream sis=new SequenceInputStream(e1);
	//SequenceInputStream sis=new SequenceInputStream(fis1,fis2);
	int n;
	while((n=sis.read())!=-1) {
		System.out.println(n);
		fos.write(n);
	}
	fis1.close();
	fis2.close();
	sis.close();
	fos.close();
}
}
