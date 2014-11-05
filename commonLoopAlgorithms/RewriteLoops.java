import java.util.Scanner;

/**
 * Write a description of class RewriteLoops here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RewriteLoops
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
//         int s = 0
//         for(int i = 1; i <= 10; i++)
//         {
//             s = s + i
//             
//         }
        int s = 0;
        int i = 1;
        
            while(i <= 10)
            {
                s = s + i;
                i++;
            
            }
        }


    public static void main2(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        
        int n = in.nextInt();
        double x = 0;
        double s = 1;
        

        s = 1.0 / (1 + n*n);
        while(s > .01)
        {
            x = x + s;
            n++;
        }
    }
}
    