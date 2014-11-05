import java.util.Scanner;
/**
 * Write a description of class FindFirstMatch here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FindFirstMatch
{

    /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
         
        System.out.print("Enter a string: ");
        String input = in.nextLine();
        
        boolean found = false;
        int index = 0;
        
        while(!found && index < input.length() )
        {
            char ch = input.charAt(index);
            if(ch == ' ')
            {
                found = true;
            }
            else
            {
                found = false;
                index++;
            }
        }
        System.out.println(index);

    }

}
