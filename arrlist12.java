// To extract a portion of a array list
import java.util.*;

class arrlist12
{
	public static void main(String args[])
	{
		List<String> colors = new ArrayList<String>();
		
		colors.add("Red");
		colors.add("Green");
		colors.add("Blue");
		
		System.out.println("List of colors: "+colors);

		List<String> subcolors = colors.subList(0, 3);
		System.out.println("Sub List of colors: "+subcolors);
	}
}