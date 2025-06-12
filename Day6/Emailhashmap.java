package Program;

import java.util.HashMap;
import java.util.HashSet;

public class Emailhashmap {

	public static void main(String[] args) {
		HashMap<String,String> stu = new HashMap();
		stu.put("Abdul","adb@gmail.com");
		stu.put("Waheed","whaeed@gmail.com");
		for (String data : stu.keySet()) {
			System.out.println(data);
		}
	}

}
