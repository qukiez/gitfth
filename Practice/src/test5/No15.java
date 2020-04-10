package test5;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class No15 {
	public static void main(String[] args) {
		Map<String,Integer> ht = new HashMap<>();
		ht.put("콩쥐팥쥐", 15000);
		ht.put("백설공주", 10000);
		ht.put("보물섬", 18000);
		NumberFormat num = new DecimalFormat("#.###원");
		Set<String> keys = ht.keySet();
		for(String key:keys) {
			System.out.println(key+"의 책가격="+num.format(ht.get(key)));
		}

	}
}
