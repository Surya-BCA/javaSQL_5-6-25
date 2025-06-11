package exceptionhandling;

import java.util.*;
import java.util.ArrayList;

public class MyArraylist {

	public static void main(String[] args) {
		ArrayList<Integer> rah = new ArrayList();
		rah.add(10);
		rah.add(20);
		rah.add(30);
		rah.forEach(num->System.out.println(num * num));
		
		System.out.println(rah);

	}

}
