import java.util.Scanner;


/**
 * Write a description of class CountMatches here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CountMatches
{


    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = in.nextLine();
        
        int spaces = 0;
        
        for(int index = 0; index < input.length(); index++ )
        {
            char ch = input.charAt(index);
            if(ch == ' ')
            {
                spaces++;
            }
        }
        System.out.println("Number of spaces in string: " + spaces);
    }

}
