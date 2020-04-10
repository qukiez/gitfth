package test5;

import java.io.ObjectInputStream.GetField;
import java.util.HashMap;
import java.util.Set;

public class HarryPorter {
	int no;
	String firstname,lastname;
	public HarryPorter(int no, String firstname, String lastname) {
		super();
		this.no = no;
		this.firstname = firstname;
		this.lastname = lastname;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	@Override
	public String toString() {
	
		return getFirstname()+"   "+getLastname();
	}
	public static void main(String[] args) {
		HarryPorter hp1 = new HarryPorter(101,"Harry","Porter");
		HarryPorter hp2 = new HarryPorter(102,"Ronald","Weasly");
		HarryPorter hp3 = new HarryPorter(103,"Hermione","Granger");
		HashMap<Integer,HarryPorter> map = new HashMap();
		map.put(hp1.getNo(),hp1);
		map.put(hp2.getNo(),hp2);
		map.put(hp3.getNo(),hp3);
		System.out.println("성     이름");
		System.out.println("-------");
		Set<Integer> keys = map.keySet();
		for(Integer key:keys) {
			HarryPorter hp = map.get(key);
			System.out.println(hp.toString());
		}
		
		
	}
}
