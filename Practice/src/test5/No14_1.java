package test5;

import java.util.StringTokenizer;

public class No14_1 {
	
	public static void main(String[] args) {
		String str = "10*30*20*40*50";
		StringTokenizer tokens = new StringTokenizer(str,"*");
		int s=0;
		
		while(tokens.hasMoreElements()){
		int a = Integer.parseInt(tokens.nextToken());
		s += a;
		System.out.println(s);
		}
		
		
		
		
	}
}
