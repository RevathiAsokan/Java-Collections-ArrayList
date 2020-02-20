//To empty an array list

import java.util.*;

class arrlist17
{
	public static void main(String args[])
	{
		ArrayList<String> colors1 = new ArrayList<String>();
		
		colors1.add("Red");
		colors1.add("Green");
		colors1.add("Blue");

		System.out.println("List of colors : "+colors1);
		colors1.removeAll(colors1);
		System.out.println("After empty : "+colors1);		
	}
}