// To swap two elements in an array list

import java.util.*;

class arrlist14
{
	public static void main(String args[])
	{
		ArrayList<String> colors1 = new ArrayList<String>();
		
		colors1.add("Red");
		colors1.add("Green");
		colors1.add("Blue");
		System.out.println("Before swap : "+colors1);
		Collections.swap(colors1, 0, 2);
		System.out.println("After swap : "+colors1);	
	}
}