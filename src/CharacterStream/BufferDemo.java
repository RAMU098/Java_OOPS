package CharacterStream;
//BufferReader and Buffer Writter

import java.io.*;
public class BufferDemo {
	public static void main(String[] args) {
		
	try {
		FileReader fr=new FileReader("abc.txt");
		BufferedReader br=new BufferedReader(fr);
		FileWriter fw=new FileWriter("xyz.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		long t1=System.nanoTime();
		int n;
		while((n=br.read())!=-1) {   //using bufferedreader and buffered writter 
			//by using fr and fw in place of br and bw it will be take more time 
			bw.write(n);
			}
		long t2=System.nanoTime();
		System.out.println("Time taken:"+(t2-t1));
	
				long t3=System.nanoTime();
				int n1;
				while((n1=fr.read())!=-1) {//using filereader and file writer
					fw.write(n1);
					}
				long t4=System.nanoTime();
				System.out.println("Time taken:"+(t4-t3));
		}
	catch(Exception e) {
		
	}
}
}