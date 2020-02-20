//to update specific array element by given element

import java.util.*;

class arrlist5
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
		colors.set(0,"Pink");
		System.out.println("List of colors after update: ");
		System.out.println(colors);
	}
}