package CollectionFrameWork;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;


class Citizen{
	private int Aid;
	public Citizen() {
		// TODO Auto-generated constructor stub
	}
	public Citizen(int aid, String aname, int age, char gen) {
		super();
		Aid = aid;
		Aname = aname;
		this.age = age;
		this.gen = gen;
	}
	@Override
	public String toString() {
		return "Citizen [Aid=" + Aid + ", Aname=" + Aname + ", age=" + age + ", gen=" + gen + "]";
	}
	public int getAid() {
		return Aid;
	}
	public void setAid(int aid) {
		Aid = aid;
	}
	public String getAname() {
		return Aname;
	}
	public void setAname(String aname) {
		Aname = aname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGen() {
		return gen;
	}
	public void setGen(char gen) {
		this.gen = gen;
	}
	private String Aname;
	private int age;
	private char gen;
}
public class AdharCardTask {
	public static void main(String[] args) {
		Citizen c1=new Citizen(101,"Ramu",21,'M');
		Citizen c2=new Citizen(102,"Raju",20,'M');
		Citizen c3=new Citizen(103,"Jyostna",22,'F');
		//HashMap<String,Citizen> hm=new HashMap<>();
		LinkedHashMap<String,Citizen> hm=new LinkedHashMap<>();
		hm.put("423678492", c1);
		hm.put("527537974", c2);
		hm.put("235446523", c3);
		System.out.println(hm);
		for(Entry<String,Citizen> ahm:hm.entrySet()) {
			System.out.println(ahm.getKey()+"  "+ahm.getValue().getAname());
		}
	}

}
