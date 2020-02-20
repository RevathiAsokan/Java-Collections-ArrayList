// to remove third element from a array list

import java.util.*;

class arrlist6
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
		colors.remove(1);
		System.out.println("List of colors after update: ");
		System.out.println(colors);
	}
}