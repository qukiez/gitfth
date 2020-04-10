package test5;

import java.util.StringTokenizer;

public class No14 {
	
	public static void main(String[] args) {
		String str = "10*30*20*40*50";
		StringTokenizer tokens = new StringTokenizer(str,"*");
		int s=0;
		
		while(tokens.hasMoreElements()){
		int a = Integer.parseInt(tokens.nextToken());//
		System.out.print(a);
		s +=a;
			if(tokens.hasMoreElements()==false) {
			System.out.print("=");
		}else {
			System.out.print("+");
		}
		
		}
		System.out.print(s);
	}
}
