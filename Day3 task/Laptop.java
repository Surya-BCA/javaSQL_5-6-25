package day;

public class Laptop {
	String brand_name ,Model;
    int screen_size,year,ram,rom;
    Laptop(String  brand_name ,String Model,int year,int ram,int rom, int screen_size){ //(og constructor)
        this.brand_name = brand_name;
        this.Model = Model;
        this.year = year;
        this.screen_size=screen_size;
        this.ram = ram;
        this.rom= rom;
    }
    
    Laptop(Laptop lap){			//copy constructor
    	this.brand_name = lap.brand_name;
        this.Model = lap.Model;
        this.year = lap.year;
        this.screen_size=lap.screen_size;
        this.ram = lap.ram;
        this.rom= lap.rom;
      	
      }
    void Display(){
    	System.out.println(brand_name+" "+Model+" "+year+" "+screen_size+" "+ram+" "+rom);
    }
    public static void main(String[] args) {
        System.out.println("Laptop Details");
        Laptop sad = new Laptop("HP","Pavilion-2024y",2024,16,512,15);
        sad.Display();
        Laptop lap = new Laptop(sad);
		lap.Display();
        
    }

}
