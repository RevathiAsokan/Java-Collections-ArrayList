//To increase the size of an array list

import java.util.*;

class arrlist20
{
	public static void main(String args[])
	{
		ArrayList<String> colors1 = new ArrayList<String>();
		
		colors1.add("Red");
		colors1.add("Green");
		colors1.add("Blue");
		
		System.out.println("Original Array list: "+colors1);
		colors1.ensureCapacity(6);
		colors1.add("Cyan");
		colors1.add("Magenta");
		colors1.add("Yellow");
		System.out.println("New Array list: "+colors1);
	}
}