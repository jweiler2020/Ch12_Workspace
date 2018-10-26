import java.util.Scanner;

public class GameOfLife
{
	private boolean[][] board;
	
	public GameOfLife(boolean[][] b)
	{
		int len = b[0].length;
		for(int i = 1; i < b.length; i++)
		{
			if(b[i].length != len)
			{
				System.out.println("Error: Array size mismatch. Exiting program now");
				System.exit(1);
			}
		}
	}
	
	public static boolean[] stringArrToBoolArr(char[] arr)
	{
		boolean[] temp = new boolean[arr.length];
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] == '0')
				temp[i] = false;
			Boolean.
		}
	}
	
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter the number of rows you would like (1-20)");
		int rows = kb.nextInt();
		kb.nextLine();
		if(rows < 0)
			rows = 0;
		else if(rows > 20)
			rows = 20;
		
		System.out.println("Enter a '0' for a dead cell, and a '1' for a live cell");
		boolean[][] board = new boolean[rows][];
		for(int i = 0; i < rows; i++)
		{
			board[i] = stringArrToBoolArr(kb.nextLine().toCharArray());
			if(board[i] == null)
			{
				System.out.println("Error: An invalid input was given. Exiting now.");
				System.exit(1);
			}
		}
	}
}
