//To replace the second element of a Array List with the specified element

import java.util.*;

class arrlist21
{
	public static void main(String args[])
	{
		ArrayList<String> colors1 = new ArrayList<String>();
		
		colors1.add("Red");
		colors1.add("Green");
		colors1.add("Blue");
		
		System.out.println("Original Array list: "+colors1);
		colors1.set(1, "Yellow");
		System.out.println("New Array list: "+colors1);
	}
}