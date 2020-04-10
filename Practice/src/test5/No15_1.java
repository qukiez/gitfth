package test5;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.HashMap;
import java.util.Map;

public class No15_1<ht> {
	ht ob;
	public ht getOb() {
		return ob;
	}
	public void setOb(ht ob) {
		this.ob = ob;
	}
	public static void main(String[] args) {
		No15_1<String> a1= new No15_1<>();
		a1.setOb("콩쥐팥쥐");
		No15_1<Integer> a2= new No15_1<>();
		a2.setOb(15000);
		No15_1<String> b1= new No15_1<>();
		b1.setOb("백설공주");
		No15_1<Integer> b2= new No15_1<>();
		b2.setOb(10000);
		No15_1<String> c1= new No15_1<>();
		c1.setOb("보물섬");
		No15_1<Integer> c2= new No15_1<>();
		c2.setOb(18000);
		
		NumberFormat pr =new DecimalFormat("##,###,###원");
		
		System.out.println(a1.getOb()+"의 책가격="
		+pr.format(a2.getOb()));
		System.out.println(b1.getOb()+"의 책가격="
		+pr.format(b2.getOb()));
		System.out.println(c1.getOb()+"의 책가격="
		+pr.format(c2.getOb()));
		
	}
	
}
