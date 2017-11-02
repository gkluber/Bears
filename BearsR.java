/* GRANT KLUBER 11/24/15
 * UIL 2013 District 1
 * Bears.java exercise
 */
import java.util.Scanner;
import java.io.File;
public class BearsR
{
	public static void main(String[] args) throws Exception
	{
		Scanner scr = new Scanner(new File("bears.dat"));

		int enums = Integer.parseInt(scr.nextLine());
		int matches = 0;

		for(int times = 0; times < enums; times++)
		{
			final int size = 10;
			for(int i=0; i<size; i++)
			{
				String line = scr.nextLine();
				for(int chr=0; chr<line.length(); chr++)
					if(line.charAt(chr)=='B')
						matches++;
			}
		}

		System.out.println(matches);
	}
}