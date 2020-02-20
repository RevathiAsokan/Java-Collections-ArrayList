// reverse elements in a array list
import java.util.*;

class arrlist11
{
	public static void main(String args[])
	{
		List<String> colors = new ArrayList<String>();
		
		colors.add("Red");
		colors.add("Green");
		colors.add("Blue");
		
		System.out.println("List of colors: "+colors);
		Collections.reverse(colors);
		System.out.println("Reverse List of colors: "+colors);
	}
}