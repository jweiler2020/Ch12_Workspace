import java.util.Scanner;

public class NumberTwentyfive
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter the number of rows to have: ");
		final int rows = kb.nextInt();
		kb.nextLine();
		System.out.print("Enter the number of columns to have: ");
		final int cols = kb.nextInt();
		kb.nextLine();
		
		double[][] arr = new double[rows][cols];
		
		for(int row = 0; row < rows; row++)
		{
			for(int col = 0; col < cols; col++)
			{
				System.out.printf("Enter the element for row %d and column %d: ", row+1, col+1);
				arr[row][col] = kb.nextDouble();
				kb.nextLine();
			}
		}
		
		double max = positiveMax(arr);
		System.out.printf("The maximum number in the matrix is: %f\n", max);
	}
	
	public static double positiveMax(double[][] arr)
	{
		double max = 0;
		for(int row = 0; row < arr.length; row++)
		{
			for(int col = 0; col < arr[0].length; col++)
			{
				if(arr[row][col] > max)
					max = arr[row][col];
			}
		}
		return max;
	}
}
