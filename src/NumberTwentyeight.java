import java.util.Scanner;

public class NumberTwentyeight
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter the number of rows you would like: ");
		final int rows = kb.nextInt();
		kb.nextLine();
		
		int[][] triangle = pascalTriangle(rows);
		printTriangle(triangle);
	}
	
	public static int[][] pascalTriangle(int n)
	{
		return pascalTriangle(n, new int[n][]);
	}
	
	private static int[][] pascalTriangle(int n, int[][] arr)
	{
		if(arr.length < n)
		{
			int[] cur = new int[n+1];
			cur[0] = 1;
			cur[cur.length-1] = 1;
			for(int i = 1; i < cur.length-1; i++)
			{
				cur[i] = arr[n-1][i-1] + arr[n-1][i];
			}
			arr[n-1] = cur;
			return pascalTriangle(n-1, arr);
		}
		else
			return arr;
	}
	
	public static void printTriangle(int[][] arr)
	{
		for(int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	}
}
