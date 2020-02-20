// to search for an element in a array list

import java.util.*;

class arrlist7
{
	public static void main(String args[])
	{
		List<String> colors = new ArrayList<String>();
		
		colors.add("Red");
		colors.add("Green");
		colors.add("Blue");
		
		System.out.println("List of colors: "+colors);

		if(colors.contains("Pink"))
			System.out.println("Color Pink Found");
		else
			System.out.println("Color Pink Not Found");
	}
}