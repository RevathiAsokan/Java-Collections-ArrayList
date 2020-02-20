//To trim the capacity of an array list to the current list size

import java.util.*;

class arrlist18
{
	public static void main(String args[])
	{
		ArrayList<String> colors1 = new ArrayList<String>();
		
		colors1.add("Red");
		colors1.add("Green");
		colors1.add("Blue");

		System.out.println("List of colors : "+colors1);
		colors1.trimToSize();
		System.out.println("After empty : "+colors1);		
	}
}