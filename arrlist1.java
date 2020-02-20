// to create a new array list, add some colors (string) and print out the collection

import java.util.*;

class arrlist1
{
	public static void main(String args[])
	{
		List<String> colors = new ArrayList<String>();
		
		colors.add("Red");
		colors.add("Green");
		colors.add("Blue");
		
		System.out.println("List of colors : "+colors);
	}
}