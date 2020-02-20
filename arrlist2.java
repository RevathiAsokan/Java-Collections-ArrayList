// to iterate through all elements in a array list

import java.util.*;

class arrlist2
{
	public static void main(String args[])
	{
		List<String> colors = new ArrayList<String>();
		
		colors.add("Red");
		colors.add("Green");
		colors.add("Blue");
		
		System.out.println("List of colors using iteration: ");
		for(String ele : colors)
			System.out.println(ele);
	}
}