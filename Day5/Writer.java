package exceptionhandling;
import java.io.*;
import java.io.FileWriter;
public class Writer {

	public static void main(String[] args) {
		
		try {
			
			FileWriter myWriter = new FileWriter("C://Users//TEMP.KGISLEDU.004//Desktop//file.txt");
			myWriter.write("rahul rossy is nauty boy ,talkative and lazy boy");
			myWriter.close();
			System.out.println("Sucessfully done");
		} catch (IOException e) {
			System.out.println("sorry failed");
		}
	}

}
