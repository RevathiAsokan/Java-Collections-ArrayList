//To print all the elements of a ArrayList using the position of the elements

import java.util.*;

class arrlist22
{
	public static void main(String args[])
	{
		ArrayList<String> colors1 = new ArrayList<String>();
		
		colors1.add("Red");
		colors1.add("Green");
		colors1.add("Blue");
		
		System.out.println("Elements of Array list: ");
		for(int i=0;i<colors1.size();i++)
			System.out.println(colors1.get(i));
	}
}