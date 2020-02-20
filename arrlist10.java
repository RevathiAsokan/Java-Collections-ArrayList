// shuffle elements in a array list
import java.util.*;

class arrlist10
{
	public static void main(String args[])
	{
		List<String> colors = new ArrayList<String>();
		
		colors.add("Red");
		colors.add("Green");
		colors.add("Blue");
		
		System.out.println("List of colors: "+colors);
		Collections.shuffle(colors);
		System.out.println("Shuffled List of colors: "+colors);
	}
}