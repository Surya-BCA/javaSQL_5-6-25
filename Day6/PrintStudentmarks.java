package Program;
import java.util.*;
import java.util.Map.Entry;
public class PrintStudentmarks{

	public static void main(String[] args) {
		HashMap<String, Integer> stu = new HashMap();
		stu.put("john", 50);
		stu.put("Abd", 45);
		stu.put("Waheed",55);
		int total = 0;
		
		for(int marks :stu.values() ) {
			total += marks;
		
		}
		for (Entry<String, Integer> Interger: stu.entrySet()) {
			System.out.println(Interger);
			

		}
		double average = total/stu.size();
		System.out.println("Total marks ="+total);
		System.out.println("Average percentage"+average);
		
	}


}
