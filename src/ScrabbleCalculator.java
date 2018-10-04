import java.io.*;
import java.util.Scanner;

public class ScrabbleCalculator
{
	private static int[] letterValues = {1, 3, 3, 2, 1, 4, 2, 4, 1, 8, 5, 1, 3, 1, 3, 3, 10, 1, 1, 1, 1, 4, 4, 8, 4, 10};
	private static File f = new File("scrabbledict.txt");
	
	public static boolean validWord(String word)
	{
		Scanner fs;
		try // Required by java compiler
		{
			fs = new Scanner(f);
		}
		catch(FileNotFoundException e)
		{
			System.out.println(String.format("Error: %s", e.toString()));
			return false;
		}
		
		while(fs.hasNextLine())
		{
			if(fs.nextLine().equalsIgnoreCase(word))
				return true;
		}
		
		return false;
	}
	
	public static int computeScore(String word)
	{
		int score = 0;
		word = word.toUpperCase();
		for(int i = 0; i < word.length(); i++)
		{
			char c = word.charAt(i);
			score += letterValues[(int)c - 65];
		}
		return score;
	}
	
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		if(!f.exists())
		{
			System.out.println("Error: Scrabble Dictionary file not found");
			return;
		}
		
		boolean done = false;
		while(!done)
		{
			System.out.print("Enter a word to test (or 'q' to quit): ");
			String word = kb.nextLine();
			
			if(word.equalsIgnoreCase("q"))
			{
				done = true;
				continue;
			}
			
			if (validWord(word))
			{
				System.out.println(String.format("The value of '%s' is %d", word, computeScore(word)));
			}
			else
			{
				System.out.println(String.format("Error: '%s' was not found in the dictionary. Please try another word", word));
			}
			System.out.println();
		}
	}
}
