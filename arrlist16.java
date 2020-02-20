// To clone an array list to another array list

import java.util.*;

class arrlist16
{
	public static void main(String args[])
	{
		ArrayList<String> colors1 = new ArrayList<String>();
		
		colors1.add("Red");
		colors1.add("Green");
		colors1.add("Blue");
	
		ArrayList<String> allcolors = new ArrayList<String>();
		allcolors = (ArrayList)colors1.clone();

		System.out.println("All colors : "+allcolors);
	}
}