import java.util.Scanner;
import java.io.*;

class Bonus
{
	private static int[][] arr = new int[20][20];
	
	private static void loadArr()
	{
		File f = new File("nums.txt");
		try
		{
			Scanner fs = new Scanner(f);
			for(int i = 0; i < 20; i++)
			{
				for(int j = 0; j < 20; j++)
				{
					arr[i][j] = fs.nextInt();
				}
			}
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Error: could not find file");
		}
	}
	
	private static int biggestProduct(int i, int j)
	{
		int localMax = 1;
		int totalMax = 0;
		
		for(int k = 0; k < 4; k++) { localMax *= arr[i+k][j]; }
		if(localMax > totalMax) totalMax = localMax;
		localMax = 1;
		
		for(int h = 0; h < 4; h++) { localMax *= arr[i][j+h]; }
		if(localMax > totalMax) totalMax = localMax;
		localMax = 1;
		
		for(int k = 0; k < 4; k++) { localMax *= arr[i+k][j+k]; }
		if(localMax > totalMax) totalMax = localMax;
		
		return totalMax;
	}
	
	public static void main(String[] args)
	{
		loadArr();
		
		int bigProd = 0;
		int tempProd;
		for(int i = 0; i < 17; i++)
		{
			for(int j = 0; j < 17; j++)
			{
				if(arr[i][j] != 0)
				{
					tempProd = biggestProduct(i, j);
					if(tempProd > bigProd) bigProd = tempProd;
				}
			}
		}
		
		System.out.println(bigProd);
	}
}