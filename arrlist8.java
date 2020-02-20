// to sort elements in a array list

import java.util.*;

class arrlist8
{
	public static void main(String args[])
	{
		List<String> colors = new ArrayList<String>();
		
		colors.add("Red");
		colors.add("Green");
		colors.add("Blue");
		
		Collections.sort(colors);
		System.out.println("List of colors: "+colors);
	}
}