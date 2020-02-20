//to retrieve an element (at a specified index) from a given array list

import java.util.*;

class arrlist4
{
	public static void main(String args[])
	{
		List<String> colors = new ArrayList<String>();
		
		colors.add("Red");
		colors.add("Green");
		colors.add("Blue");
		
		System.out.println("List of colors: ");
		for(String ele : colors)
			System.out.println(ele);
		
		System.out.println("Element at position 0: ");
		System.out.println(colors.get(0));
	}
}