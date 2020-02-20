// To compare two array lists
import java.util.*;

class arrlist13
{
	public static void main(String args[])
	{
		ArrayList<String> colors1 = new ArrayList<String>();
		ArrayList<String> colors2 = new ArrayList<String>();
		ArrayList<String> compcolors = new ArrayList<String>();
		
		colors1.add("Red");
		colors1.add("Green");
		colors1.add("Blue");
		
		colors2.add("Red");
		colors2.add("Blue");
		colors2.add("Magenta");
		
		for(String ele : colors1)
			compcolors.add(colors2.contains(ele)?"Yes":"No");
		
		System.out.println("Comparison of colors : "+compcolors);
	
	}
}