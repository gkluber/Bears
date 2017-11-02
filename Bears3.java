/* GRANT KLUBER 11/24/15
 * UIL 2013 District 1
 * Bears.java exercise
 *
 * WORSE example..more specifically- what not to do
 */
import java.util.Scanner;
import java.io.File;
public class Bears3
{
	public static void main(String[] args)
	{
		//UNCONVENTIONAL USE OF TRY-CATCH BLOCK
		//points will be taken off if the Scanner object is declared as such..
		//yes, it compiles and executes fine: but that alone does not ensure that
		//the program agrees with sensical logic.
		//ie- a NullPointerException will throw if the catch block is executed
		//exceptions such as NullPointerException and RuntimeException do not require a try-catch block
		//and hence can sneak into your compiled program
		Scanner scr;
		try
		{
			scr = new Scanner(new File("bears.dat"));
		}
		catch(Exception e)
		{
			scr = null;
		}
		// ^ all of this is unnecessary


		//DO NOT USE SCANNER.NEXTINT() UNLESS YOU KNOW HOW TO!
		//using nextInt() will leave the newline character inside of the Scanner's buffer..
		//if the Scanner is not re-instantiated or cleared it will keep the newline character inside its buffer
		//and cause problems.. regardless it is bad practice to do so
		//personally I would avoid using Scanner.nextInt() entirely hence all of the problems it can cause..
		//ideally use: Integer.parseInt(<scanner>.nextLine())
		//which will effectively ensure that the buffer is not left with any newline characters
		int enums = scr.nextInt();

		int matches = 0;

		for(int times = 0; times < enums; times++)
		{
			//i<10.. this is bad practice hence the "10" is completely unwarranted.
			//use of self-identifying constants is ideal
			for(int i=0; i<10; i++)
			{
				//DO NOT USE SCANNER.NEXT()!
				//it does not do what you'd expect it to do!
				//Scanner.nextLine() is the most reliable way to retrieve lines of data.
				//Scanner.next(), yes will read until a newline character is reached.. but ALSO
				//it will read up until the DELIMITER is reached: by default a space character as well
				//as the newline character
				String line = scr.next();

				//this may seem logical, but in actuality this will INCREASE RUN-TIME.
				//by adding this segment to your code, you are effectively preventing the
				//following algorithm from running if the String does not contain the letter "B";
				//but the contains() method is EXCESSIVE hence the program would be searching
				//for the letter "B" twice consecutively
				//this line alone effectively doubles the run-time of the program
				if(!line.contains("B"))
					continue;

				for(int chr=0; chr<line.length(); chr++)
					if(line.charAt(chr)=='B')
						matches++;
			}
		}

		//oldest mistake in the book.. should be println()
		System.out.print(matches);
	}
}