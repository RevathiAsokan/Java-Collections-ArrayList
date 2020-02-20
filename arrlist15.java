// To join two array lists

import java.util.*;

class arrlist15
{
	public static void main(String args[])
	{
		ArrayList<String> colors1 = new ArrayList<String>();
		ArrayList<String> colors2 = new ArrayList<String>();
		ArrayList<String> allcolors = new ArrayList<String>();
		
		colors1.add("Red");
		colors1.add("Green");
		colors1.add("Blue");
		
		colors2.add("Red");
		colors2.add("Blue");
		colors2.add("Magenta");
		
		allcolors.addAll(colors1);
		allcolors.addAll(colors2);
		
		System.out.println("All colors : "+allcolors);
	}
}