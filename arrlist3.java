// to insert an element into the array list at the first position.

import java.util.*;

class arrlist3
{
	public static void main(String args[])
	{
		List<String> colors = new ArrayList<String>();
		
		colors.add("Red");
		colors.add("Green");
		colors.add("Blue");
		
		System.out.println("List of colors before insert: ");
		for(String ele : colors)
			System.out.println(ele);
		
		System.out.println("List of colors after insert at position 0: ");
		colors.add(0,"Pink");
		for(String ele : colors)
			System.out.println(ele);
		
	}
}