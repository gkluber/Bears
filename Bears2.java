/* GRANT KLUBER 11/24/15
 * UIL 2013 District 1
 * Bears.java exercise
 *
 * BETTER example
 */
//the previous example is not bad.. but instead reflects an rather average entry..
//creativity and efficiency is looked for and this example displays that ideally
//KEEP IN MIND THAT THE SHORTER THE PROGRAM IS: THE BETTER!
import java.util.Scanner;
import java.io.File;
//this is not required: but proper demonstration of advanced topics will inevitably
//boost your score.
//this will import all fields from the class java.lang.System.. the System class called with System.out
//using the static import will allow you to use the PrintStream System.out without specifying the "System"
//class preceeding it
import static java.lang.System.*;
public class Bears2
{
	public static void main(String[] args) throws Exception
	{
		//generic UIL declarations
		Scanner scr = new Scanner(new File("bears.dat"));
		int enums = Integer.parseInt(scr.nextLine().trim());
		int matches = 0;

		for(int times = 0; times < enums; times++)
		{
			final int size = 10;
			for(int i=0; i<size; i++)
			{
				String line = scr.nextLine();
				//replaces every character that is not "B" with empty space
				//then counts the number characters remaining.. hence effectively counting the number of B's
				//with just a single line of code
				matches+=line.replaceAll("[^B]","").length();
				//versus the previous algorithm:

				/* for(int chr=0; chr<line.length(); chr++)
				* if(line.charAt(chr)=='B')
				* matches++;
				*/
			}
		}

		//result of the static import of java.lang.System.* .. hence "System" does not require specification
		out.println(matches);
	}
}