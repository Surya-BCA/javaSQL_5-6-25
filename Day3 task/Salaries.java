package day;
import java.util.*;
public class Salaries {
	void Employ(String category,double Salary,String employ_type) {
		System.out.println("Your category:"+category);
		System.out.println("Item salary:"+Salary);
	}
	void Employ(String category,double Salary,int time,String Employ_type) {
		double salary=time*Salary;
		System.out.println(salary);
	}
	
	public static void main(String[] args) {
		System.out.println("Employe Salaries");
		Salaries in = new Salaries();
		
		in.Employ("Emp-l",100,10,"Full-time");
		in.Employ("Emp-ll",50,6,"Part-time");
		in.Employ("Emp-lll",10000,1,"Free lancers");

	}

}
