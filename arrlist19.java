//To test an array list is empty or not

import java.util.*;

class arrlist19
{
	public static void main(String args[])
	{
		ArrayList<String> colors1 = new ArrayList<String>();
		
		colors1.add("Red");
		colors1.add("Green");
		colors1.add("Blue");

		System.out.println("List of colors : "+colors1);
		if(colors1.isEmpty())
			System.out.println("Empty list");
		else
			System.out.println("Non Empty list");		
	}
}