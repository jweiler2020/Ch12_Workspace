import java.util.ArrayList;

public class NumberFifteen
{
	public static void removeDuplicate(ArrayList<String> a)
	{
		for(int i = 0; i < a.size(); i++)
		{
			String compare = a.get(i);
			for(int j = i+1; j < a.size(); j++)
			{
				if(compare.equals(a.get(j)))
				{
					a.remove(j);
					j--;
				}
			}
		}
	}
	
	public static void main(String[] args)
	{
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("Hello");
		arr.add("there");
		arr.add("my");
		arr.add("name");
		arr.add("is");
		arr.add("Hello");
		arr.add("Hello");
		arr.add("asdfasdf");
		arr.add("there");
		arr.add("Hello");
		arr.add("it works!");
		
		System.out.println("Before: " + arr);
		removeDuplicate(arr);
		System.out.println("After: " + arr);
	}
}
