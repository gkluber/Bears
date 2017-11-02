/* GRANT KLUBER 11/24/15
 * UIL 2013 District 1
 * Bears.java exercise
 *
 * GOOD example
 */
import java.util.Scanner;
import java.io.File;
public class Bears1
{
	//preceded with "throws Exception" so that the entire program is not encapsulated in a try-catch block..
	//especially with the unhandled FileNotFoundException
	public static void main(String[] args) throws Exception
	{
		//creates the scanner object; taking the file bears.dat as input
		//notice: the exception thrown MUST be handled in some way...
		//ignorance of the unchecked exception will result in penalty
		Scanner scr = new Scanner(new File("bears.dat"));

		//enumerations or number of maps that the instance will have to read
		int enums = Integer.parseInt(scr.nextLine());

		//final number of matches.. to be printed out lastly
		int matches = 0;

		//for loop for each map
		//EVERY EXERCISE SHOULD BEGIN WITH A FOR LOOP SIMILIAR TO SO!
		//hence a number of elements is always specified in the first line of the data file
		//in this scenario it is "1"
		for(int times = 0; times < enums; times++)
		{
			//the number of lines per map
			final int size = 10;

			//reading each line of the map individually
			for(int i=0; i<size; i++)
			{
				String line = scr.nextLine();

				//looping through every character then counting up when a match occurs..
				//in this case the program is matching the number of brown bears that live in the area
				//represented by the map of characters: more specially represented by the character 'B'
				for(int chr=0; chr<line.length(); chr++)
					if(line.charAt(chr)=='B')
						matches++;
			}
		}

		//print the final number of matches for all of the scanned data
		System.out.println(matches);
	}
}