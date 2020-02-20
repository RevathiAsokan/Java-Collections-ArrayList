// to copy one array list into another

import java.util.*;

class arrlist9
{
	public static void main(String args[])
	{
		List<String> colors1 = new ArrayList<String>();
		List<String> colors2 = new ArrayList<String>();
		
		colors1.add("Red");
		colors1.add("Green");
		colors2.add("Cyan");
		colors2.add("Magenta");
		
		System.out.println("List of colors1: "+colors1);
		System.out.println("List of colors2: "+colors2);
		
		Collections.copy(colors1,colors2);
		System.out.println("After list2 is copied to list1");
		System.out.println("List of colors1: "+colors1);
		System.out.println("List of colors2: "+colors2);
	}
}