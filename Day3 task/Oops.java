public class Oops {
	String name,last;
	int year;
	Oops(String name,int year,String last){
		this.name=name;
		this.year=year;
		this.last=last;
			}
	//parameterized constructor
	public Oops(Oops abd2) {
		this.name=abd2.name; // for display the copy constructor 
		this.year=abd2.year;
		this.last=abd2.last;
		
	}
	//display function
	void Display() {
		System.out.println("Oops"+" "+name+" "+year+" "+last);
	}
	public static void main(String[] args) {
		System.out.println("og constructor");
		Oops abd = new Oops("Abdul",2006,"Waheed");
		abd.Display();// for display og constructor
		Oops abd2 = new Oops(abd);
		abd2.Display();// for display copy constructor
		
	}
}
