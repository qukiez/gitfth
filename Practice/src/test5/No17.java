package test5;

import java.util.Hashtable;
import java.util.Scanner;
import java.util.Set;

class PhoneBook{
	String phoneNumber;
	String address;
	public PhoneBook(String phoneNumber, String address) {
		super();
		this.phoneNumber = phoneNumber;
		this.address = address;
	}
	@Override
	public String toString() {
	
		return "phone: "+phoneNumber+"\n"
				+"address: "+address; //연락처와 주소 문자열로 리턴
	}
}
public class No17 {
	public static void main(String[] args) {
		PhoneBook pb1 = new PhoneBook("123-4567","서울");
		PhoneBook pb2 = new PhoneBook("345-3345","대구");
		PhoneBook pb3 = new PhoneBook("123-7890","부산");
		Hashtable<String,PhoneBook> map = new Hashtable<>();
		map.put("홍길동",pb1);
		map.put("이몽룡",pb2);
		map.put("임꺽정",pb3);
		Scanner sc = new Scanner(System.in);
		System.out.print("찾는이름:");
		String name = sc.next();
		Set<String> keys = map.keySet();
		if(map.get(name)==null) {
			System.out.println("그런 사람 없음");
		}else {
			System.out.println(map.get(name).toString());
		}
		
		
		
		
	}
}
