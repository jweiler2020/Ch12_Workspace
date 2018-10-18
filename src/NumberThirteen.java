import java.util.ArrayList;

public class NumberThirteen
{
	public static void removeLowestInteger(ArrayList<Integer>a)
	{
		int least = a.get(0);
		for(int i = 1; i < a.size(); i++)
		{
			if(a.get(i) < least)
			{
				least = a.get(i);
			}
		}
		a.remove(new Integer(least));
	}
	
	public static void main(String[] args)
	{
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		arrList.add(1);
		arrList.add(2);
		arrList.add(3);
		arrList.add(4);
		System.out.println("Before: " + arrList);
		removeLowestInteger(arrList);
		System.out.println("After: " + arrList);
		
		arrList.add(-1);
		arrList.add(-3);
		arrList.add(4);
		arrList.add(-10);
		System.out.println("Before: " + arrList);
		removeLowestInteger(arrList);
		System.out.println("After: " + arrList);
	}
}
