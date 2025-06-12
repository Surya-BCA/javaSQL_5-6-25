package Program;

import java.util.HashSet;

public class Email_task2hashset {

	public static void main(String[] args) {
		HashSet<String> stumail = new HashSet();
		stumail.add("adb@gmail.com");
		stumail.add("whaeed@gmail.com");
		for (String data : stumail) {
			System.out.println(data);
		}
	}

}
