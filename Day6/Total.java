package Program;
import java.util.*;
public class Total {

	public static void main(String[] args) {
		HashMap<String, Integer> stu = new HashMap();
		stu.put("john", 50);
		stu.put("Abd", 45);
		stu.put("Waheed",55);
		int total = 0;
		for(int marks :stu.values() ) {
			total += marks;
		
		}
		System.out.println("Total marks"+total);
		double average = total/stu.size();
		System.out.println("Average percentage"+average);
	}


}
