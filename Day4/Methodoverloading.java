package day4;

public class Methodoverloading {
	public void Methodoverloading (int x,int y) {
		System.out.println("The result is:"+(x+y));
		}
	public void Methodoverloading(double x,double y){
		System.out.println("The result is:"+(x+y));
	}
	


public static void main(String[] args) {
	Methodoverloading in = new Methodoverloading();
	in.Methodoverloading(10,15);
	in.Methodoverloading(45, 5);
}
}