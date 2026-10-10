package CollectionFrameWork;
//Demonstraction of a hashmap with StudentObject
import java.util.HashMap;
import java.util.Map.Entry;

class Student{
	private int  id;
	private String name;
	private int age;
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}

public class HashMapTask {
public static void main(String[] args) {
	Student str1=new Student(100,"Ramu",20);
	Student str2=new Student(101,"Raju",20);
	Student str3=new Student(102,"nani",21);
	HashMap<Character,Student> hm=new HashMap<>();
	hm.put('A', str1);
	hm.put('B', str2);
	hm.put('C', str3);
	System.out.println(hm);
	for(Entry<Character, Student> shm:hm.entrySet()) {
		System.out.println(shm.getKey()+" "+shm.getValue().getName());// getname for specific value to print
	}
	
}
}
