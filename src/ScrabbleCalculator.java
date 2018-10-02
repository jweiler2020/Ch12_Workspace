import java.io.*;
import java.util.Scanner;

public class ScrabbleCalculator
{
	private int[] letterValues = {1, 3, 3, 2, 1, 4, 2, 4, 1, 8, 5, 1, 3, 1, 3, 3, 10, 1, 1, 1, 1, 4, 4, 8, 4, 10};
	
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		File f = new File("scrabbledict.txt");
		try
		{
			Scanner fs = new Scanner(f);
			int lines = 0;
			while(fs.hasNextLine())
			{
				lines++;
				fs.nextLine();
			}
			
			System.out.println(lines);
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Error: Scrabble Dictionary file not found");
		}
	}
}
